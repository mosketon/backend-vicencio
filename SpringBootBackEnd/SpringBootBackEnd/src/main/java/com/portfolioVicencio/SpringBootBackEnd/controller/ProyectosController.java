package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.Dto.dtoProyectos;
import com.portfolioVicencio.SpringBootBackEnd.model.Proyectos;

import com.portfolioVicencio.SpringBootBackEnd.Security.Controller.Mensaje;
import com.portfolioVicencio.SpringBootBackEnd.service.ProyectosService;
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
@RequestMapping ("proyectos")
@CrossOrigin (origins = "https://portfoliovicencioap.web.app")
public class ProyectosController {

    @Autowired
    private ProyectosService proyectosService;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list() {
        List<Proyectos> list = proyectosService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtoPro) {
        if (StringUtils.isBlank(dtoPro.getNombrePro())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (proyectosService.existsByNombre(dtoPro.getNombrePro())) {
            return new ResponseEntity(new Mensaje("Ese proyecto existe"), HttpStatus.BAD_REQUEST);
        }
        Proyectos proyectos = new Proyectos(dtoPro.getNombrePro(), dtoPro.getDescripcionPro(), dtoPro.getFotoPro());
        proyectosService.save(proyectos);

        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyectos dtoPro) {
        if (!proyectosService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (proyectosService.existsByNombre(dtoPro.getNombrePro()) && proyectosService.getByNombrePro(dtoPro.getNombrePro()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Proyecto ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoPro.getNombrePro())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Proyectos proyectos = proyectosService.getOne(id).get();
        proyectos.setNombrePro(dtoPro.getNombrePro());
        proyectos.setDescripcionPro(dtoPro.getDescripcionPro());
        proyectos.setFotoPro(dtoPro.getFotoPro());

        proyectosService.save(proyectos);
        return new ResponseEntity(new Mensaje("Proyecto actualizada"), HttpStatus.OK);
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!proyectosService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }

        proyectosService.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id) {
        if (!proyectosService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Proyectos proyectos = proyectosService.getOne(id).get();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
}
