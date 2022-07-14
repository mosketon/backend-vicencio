package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.service.IEspecializacionesService;
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
public class EspecializacionesController {

    @Autowired
    private IEspecializacionesService espServ;

    @PreAuthorize("hashRole('ADMIN')")
    @PostMapping("/especializaciones/new")
    public void agregarEspecializaciones(@RequestBody Especializaciones esp) {
        espServ.crearEspecializaciones(esp);
    }

    @GetMapping("/especializaciones/ver")
    @ResponseBody
    public List<Especializaciones> verEspecializaciones() {
        return espServ.verEspecializaciones();
    }

    @PreAuthorize("hashRole('ADMIN')")
    @DeleteMapping("/especializaciones/delete/{id}")
    public void borrarEspecializaciones(@PathVariable Long id) {
        espServ.borrarEspecializaciones(id);
    }

    @PreAuthorize("hashRole('ADMIN')")
    @PutMapping("/especializaciones/editar/{id}")
    public Especializaciones editEspecializaciones(@PathVariable Long id,
            @RequestParam("especiallidad") String nuevoEspecialidad,
            @RequestParam("descripcion") String nuevoDescripcion,
            @RequestParam("foto") String nuevoFoto) {
        Especializaciones esp = espServ.buscarEspecializaciones(id);

        esp.setEspecialidad(nuevoEspecialidad);
        esp.setDescripcion(nuevoDescripcion);
        esp.setFoto(nuevoFoto);

        espServ.crearEspecializaciones(esp);
        return esp;
    }
}
