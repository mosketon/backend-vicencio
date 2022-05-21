package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Proyectos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private String foto;
    
    public Proyectos(){
        
    }
    
    public Proyectos (Long id, String nombre, String descripcion, String foto){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.foto=foto;
        
    }
}
