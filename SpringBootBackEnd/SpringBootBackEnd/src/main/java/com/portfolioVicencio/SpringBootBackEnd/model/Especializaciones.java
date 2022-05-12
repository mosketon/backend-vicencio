package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity

public class Especializaciones {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String especialidad;
    private String descripcion;
    
    public Especializaciones(){
        
    }
    
    public Especializaciones (Long id, String especialidad, String descripcion){
        this.id=id;
        this.especialidad=especialidad;
        this.descripcion=descripcion;
    }
}
