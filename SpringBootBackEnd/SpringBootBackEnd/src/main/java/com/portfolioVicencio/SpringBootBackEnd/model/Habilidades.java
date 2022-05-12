package com.portfolioVicencio.SpringBootBackEnd.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Habilidades {
    
    private Long id;
    private String tipo;
    private String porcentaje;
    
    public Habilidades(){
        
    }
    
    public Habilidades (Long id, String tipo, String porcentaje){
        this.id=id;
        this.tipo=tipo;
        this.porcentaje=porcentaje;
    }
}
