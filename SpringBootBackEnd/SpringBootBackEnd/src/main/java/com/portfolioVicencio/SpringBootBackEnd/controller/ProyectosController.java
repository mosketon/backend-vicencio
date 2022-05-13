
package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Proyectos;
import com.portfolioVicencio.SpringBootBackEnd.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    
    @Autowired
     private IProyectosService proServ;
    
    @PostMapping ("/new/proyectos")
    public void agregarProyectos (@RequestBody Proyectos pro){
        proServ.crearProyectos(pro);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proServ.verProyectos();
    }
    
    @DeleteMapping ("/delete/proyectos/{id}")
    public void borrarProyectos (@PathVariable Long id){
        proServ.borrarProyectos(id);
    }
    
}
