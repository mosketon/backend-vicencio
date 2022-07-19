package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Educacion;
import com.portfolioVicencio.SpringBootBackEnd.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    private IEducacionService eduServ;

    @PreAuthorize("hashRole('ADMIN')")
    @PostMapping("/educacion/new")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }

    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducación();
    }

    @PreAuthorize("hashRole('ADMIN')")
    @DeleteMapping("/educacion/delete/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @PreAuthorize("hashRole('ADMIN')")
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestParam("establecimiento") String nuevoEstablecimiento,
            @RequestParam("desde") String nuevoDesde,
            @RequestParam("hasta") String nuevoHasta,
            @RequestParam("lugar") String nuevoLugar,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("foto") String nuevoFoto) {
        Educacion edu = eduServ.buscarEducacion(id);

        edu.setEstablecimiento(nuevoEstablecimiento);
        edu.setDesde(nuevoDesde);
        edu.setHasta(nuevoHasta);
        edu.setLugar(nuevoLugar);
        edu.setTitulo(nuevoTitulo);
        edu.setFoto(nuevoFoto);

        eduServ.crearEducacion(edu);
        return edu;
    }
}
