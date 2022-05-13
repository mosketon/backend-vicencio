
package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.service.IEspecializacionesService;
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
public class EspecializacionesController {
    

    @Autowired
    private IEspecializacionesService espServ;
    
    @PostMapping ("/new/especializaciones")
    public void agregarEspecializaciones (@RequestBody Especializaciones esp){
        espServ.crearEspecializaciones(esp);
    }
    
    @GetMapping ("/ver/especializaciones")
    @ResponseBody
    public List<Especializaciones> verEspecializaciones(){
        return espServ.verEspecializaciones();
    }
    
    @DeleteMapping ("/delete/especializaciones/{id}")
    public void borrarEspecializaciones (@PathVariable Long id){
        espServ.borrarEspecializaciones(id);
    }
}
