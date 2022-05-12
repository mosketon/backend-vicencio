package com.portfolioVicencio.SpringBootBackEnd.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Educacion {

    private Long id;
    private String establecimiento;
    private String desde;
    private String hasta;
    private String lugar;
    private String titulo;

    public Educacion() {

    }

    public Educacion(Long id, String establecimiento, String desde, String hasta, String lugar, String titulo) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.desde = desde;
        this.hasta = hasta;
        this.titulo = titulo;
    }
}
