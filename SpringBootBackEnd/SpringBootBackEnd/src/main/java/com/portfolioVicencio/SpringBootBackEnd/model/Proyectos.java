package com.portfolioVicencio.SpringBootBackEnd.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Proyectos {
    
    private Long id;
    private String nombre;
    private String descripcion;
    
    public Proyectos(){
        
    }
    
    public Proyectos (Long id, String nombre, String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
}
