package com.portfolioVicencio.SpringBootBackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEspecializaciones {

    @NotBlank
    private String nombreEspe;
    @NotBlank
    private String descripcionEspe;
    private String fotoEspe;

    public dtoEspecializaciones() {
    }

    public dtoEspecializaciones(String nombreEspe, String descripcionEspe, String fotoEspe) {
        this.nombreEspe = nombreEspe;
        this.descripcionEspe = descripcionEspe;
        this.fotoEspe = fotoEspe;
    }

    public String getNombreEspe() {
        return nombreEspe;
    }

    public void setNombreEspe(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }

    public String getDescripcionEspe() {
        return descripcionEspe;
    }

    public void setDescripcionEspe(String descripcionEspe) {
        this.descripcionEspe = descripcionEspe;
    }

    public String getFotoEspe() {
        return fotoEspe;
    }

    public void setFotoEspe(String fotoEspe) {
        this.fotoEspe = fotoEspe;
    }

    
}

 