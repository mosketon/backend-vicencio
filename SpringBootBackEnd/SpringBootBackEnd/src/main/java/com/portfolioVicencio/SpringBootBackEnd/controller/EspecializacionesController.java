package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.Dto.dtoEspecializaciones;
import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.Security.Controller.Mensaje;
import com.portfolioVicencio.SpringBootBackEnd.service.EspecializacionesService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("especializaciones")
@CrossOrigin(origins = "https://portfoliovicencioap.web.app")
public class EspecializacionesController {

    @Autowired
    private EspecializacionesService especializacionesService;

    @GetMapping("/lista")
    public ResponseEntity<List<Especializaciones>> list() {
        List<Especializaciones> list = especializacionesService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEspecializaciones dtoEspe) {
        if (StringUtils.isBlank(dtoEspe.getNombreEspe())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (especializacionesService.existsByNombre(dtoEspe.getNombreEspe())) {
            return new ResponseEntity(new Mensaje("Esa especialización existe"), HttpStatus.BAD_REQUEST);
        }
        Especializaciones especializaciones = new Especializaciones(dtoEspe.getNombreEspe(), dtoEspe.getDescripcionEspe(), dtoEspe.getFotoEspe());
        especializacionesService.save(especializaciones);

        return new ResponseEntity(new Mensaje("Especializacion agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEspecializaciones dtoEspe) {
        if (!especializacionesService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (especializacionesService.existsByNombre(dtoEspe.getNombreEspe()) && especializacionesService.getByNombreEspe(dtoEspe.getNombreEspe()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Especialización ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoEspe.getNombreEspe())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Especializaciones especializaciones = especializacionesService.getOne(id).get();
        especializaciones.setNombreEspe(dtoEspe.getNombreEspe());
        especializaciones.setDescripcionEspe(dtoEspe.getDescripcionEspe());
        especializaciones.setFotoEspe(dtoEspe.getFotoEspe());

        especializacionesService.save(especializaciones);
        return new ResponseEntity(new Mensaje("Especialización actualizada"), HttpStatus.OK);
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!especializacionesService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }

        especializacionesService.delete(id);
        return new ResponseEntity(new Mensaje("Especialización eliminada"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Especializaciones> getById(@PathVariable("id") int id) {
        if (!especializacionesService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Especializaciones especializaciones = especializacionesService.getOne(id).get();
        return new ResponseEntity<>(especializaciones, HttpStatus.OK);
    }
}
