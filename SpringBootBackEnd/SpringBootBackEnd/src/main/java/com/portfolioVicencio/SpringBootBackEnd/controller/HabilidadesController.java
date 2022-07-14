package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import com.portfolioVicencio.SpringBootBackEnd.service.IHabilidadesService;
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
@CrossOrigin (origins = "http://localHost:4200")
public class HabilidadesController {

    @Autowired
    private IHabilidadesService habiServ;

    @PreAuthorize("hashRole('ADMIN')")
    @PostMapping("/habilidades/new")
    public void agregarhabilidades(@RequestBody Habilidades hab) {
        habiServ.crearHabilidades(hab);
    }

    @GetMapping("/habilidades/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return habiServ.verHabilidades();
    }

    @PreAuthorize("hashRole('ADMIN')")
    @DeleteMapping("/habilidades/delete/{id}")
    public void borrarHabilidades(@PathVariable Long id) {
        habiServ.borrarHabilidades(id);
    }

    @PreAuthorize("hashRole('ADMIN')")
    @PutMapping("/habilidades/editar/{id}")
    public Habilidades editEducacion(@PathVariable Long id,
            @RequestParam("tipo") String nuevoTipo,
            @RequestParam("porcentaje") String nuevoPorcentaje,
            @RequestParam("foto") String nuevoFoto) {
        Habilidades hab = habiServ.buscarHabilidades(id);

        hab.setTipo(nuevoTipo);
        hab.setPorcentaje(nuevoPorcentaje);
        hab.setFoto(nuevoFoto);

        habiServ.crearHabilidades(hab);
        return hab;
    }

}
