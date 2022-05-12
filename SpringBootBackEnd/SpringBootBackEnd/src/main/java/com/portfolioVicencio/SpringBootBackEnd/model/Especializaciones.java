package com.portfolioVicencio.SpringBootBackEnd.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Especializaciones {
    
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
