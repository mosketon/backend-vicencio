
package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Proyectos;
import com.portfolioVicencio.SpringBootBackEnd.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProyectosController {
    
    @Autowired
    private IProyectosService proyeServ;
   
    @PostMapping ("/new/proyectos")
    public void agregarProyectos (@RequestBody Proyectos pro){
        proyeServ.crearProyectos(pro);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyeServ.verProyectos();
    }
    
    @DeleteMapping ("/delete/proyectos/{id}")
    public void borrarProyectos (@PathVariable Long id){
        proyeServ.borrarProyectos(id);
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("descripcion") String nuevoDescripcion,
                                @RequestParam ("foto") String nuevoFoto){
       Proyectos pro = proyeServ.buscarProyectos(id);
       
       pro.setNombre(nuevoNombre);
       pro.setDescripcion(nuevoDescripcion);
       pro.setFoto(nuevoFoto);
       
       proyeServ.crearProyectos(pro);
       return pro;
    }
}