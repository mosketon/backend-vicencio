package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Persona;
import com.portfolioVicencio.SpringBootBackEnd.service.IPersonaService;
import com.portfolioVicencio.SpringBootBackEnd.service.PersonaService;
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
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @PreAuthorize("hashRole('ADMIN')")
    @PostMapping("/new/personas")
    public void agregarPersona(@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona() {
        return persoServ.verPersona();
    }

    @PreAuthorize("hashRole('ADMIN')")
    @DeleteMapping("/delete/personas/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

    @PreAuthorize("hashRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("acercaDe") String nuevoAcercaDe,
            @RequestParam("fotoperfil") String nuevoFotoperfil) {
        Persona per = persoServ.buscarPersona(id);

        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        per.setAcercaDe(nuevoAcercaDe);
        per.setFotoperfil(nuevoFotoperfil);

        persoServ.crearPersona(per);
        return per;
    }

}
