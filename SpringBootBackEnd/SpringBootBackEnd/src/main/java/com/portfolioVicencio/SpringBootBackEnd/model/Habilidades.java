package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity

public class Habilidades {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipo;
    private String porcentaje;
    private String foto;
    
    public Habilidades(){
        
    }
    
    public Habilidades (Long id, String tipo, String porcentaje, String foto){
        this.id=id;
        this.tipo=tipo;
        this.porcentaje=porcentaje;
        this.foto=foto;
    }
}
