
package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Persona;
import com.portfolioVicencio.SpringBootBackEnd.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/personas")
    public void agregarPersona (@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersona();
    }
    
    @DeleteMapping ("/delete/personas/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
        
}
