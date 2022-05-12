
package com.portfolioVicencio.SpringBootBackEnd.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Experiencia {
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
