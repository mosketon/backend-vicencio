package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Experiencia;
import com.portfolioVicencio.SpringBootBackEnd.service.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private IExperienciaService expeServ;

    @PreAuthorize("hashRole('ADMIN')")
    @PostMapping("/experiencia/new")
    public void agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
    }

    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expeServ.verExperiencia();
    }

    @PreAuthorize("hashRole('ADMIN')")
    @DeleteMapping("/experiencia/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }

    @PreAuthorize("hashRole('ADMIN')")
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("desde") String nuevoDesde,
            @RequestParam("hasta") String nuevoHasta,
            @RequestParam("lugar") String nuevoLugar,
            @RequestParam("foto") String nuevoFoto) {
        Experiencia expe = expeServ.buscarExperiencia(id);

        expe.setNombre(nuevoNombre);
        expe.setDesde(nuevoDesde);
        expe.setHasta(nuevoHasta);
        expe.setLugar(nuevoLugar);
        expe.setFoto(nuevoFoto);

        expeServ.crearExperiencia(expe);
        return expe;
    }
}
