package com.portfolioVicencio.SpringBootBackEnd.personamodel;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String acercaDe;
    
    public Persona(){
        
    }
    
    public Persona (Long id, String nombre, String apellido, String acercaDe){
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDe = acercaDe;
    }
            
    
}
