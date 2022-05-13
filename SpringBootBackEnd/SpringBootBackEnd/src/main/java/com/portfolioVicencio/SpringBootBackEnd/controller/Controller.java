
package com.portfolioVicencio.SpringBootBackEnd.controller;

import com.portfolioVicencio.SpringBootBackEnd.model.Educacion;
import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.model.Experiencia;
import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import com.portfolioVicencio.SpringBootBackEnd.model.Persona;
import com.portfolioVicencio.SpringBootBackEnd.model.Proyectos;
import com.portfolioVicencio.SpringBootBackEnd.service.IEducacionService;
import com.portfolioVicencio.SpringBootBackEnd.service.IEspecializacionesService;
import com.portfolioVicencio.SpringBootBackEnd.service.IExperienciaService;
import com.portfolioVicencio.SpringBootBackEnd.service.IHabilidadesService;
import com.portfolioVicencio.SpringBootBackEnd.service.IPersonaService;
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
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    private IEducacionService eduServ;
    private IEspecializacionesService espServ;
    private IExperienciaService expeServ;
    private IHabilidadesService habiServ;
    private IProyectosService proServ;
    
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
    
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducación();
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
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
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia expe){
        expeServ.crearExperiencia(expe);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expeServ.borrarExperiencia(id);
    }
    
    @PostMapping ("/new/habilidades")
    public void agregarhabilidades (@RequestBody Habilidades hab){
        habiServ.crearHabilidades(hab);
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades(){
        return habiServ.verHabilidades();
    }
    
    @DeleteMapping ("/delete/habilidades/{id}")
    public void borrarHabilidades (@PathVariable Long id){
        habiServ.borrarHabilidades(id);
    }
    
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
