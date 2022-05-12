
package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String lugar;
    private String desde;
    private String hasta;
    
    public Experiencia(){
        
    }
    
    public Experiencia (Long id, String nombre, String lugar, String desde, String hasta){
        
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.desde = desde;
        this.hasta = hasta;
    }
}
