package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String acercaDe;
    private String fotoperfil;
    
    public Persona(){
        
    }
    
    public Persona (Long id, String nombre, String apellido, String acercaDe, String fotoperfil){
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDe = acercaDe;
        this.fotoperfil = fotoperfil;
    }
            
    
}
