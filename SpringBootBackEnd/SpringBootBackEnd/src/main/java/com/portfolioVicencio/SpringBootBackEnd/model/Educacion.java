package com.portfolioVicencio.SpringBootBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String establecimiento;
    private String desde;
    private String hasta;
    private String lugar;
    private String titulo;
    private String foto;

    public Educacion() {

    }

    public Educacion(Long id, String establecimiento, String desde, String hasta, String lugar, String titulo, String foto) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.desde = desde;
        this.hasta = hasta;
        this.titulo = titulo;
        this.foto = foto;
    }
}
