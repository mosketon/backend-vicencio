package com.portfolioVicencio.SpringBootBackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    private String fotoEdu;

    //Const
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, String fotoEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.fotoEdu = fotoEdu;
    }

    //G y S
    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getFotoEdu() {
        return fotoEdu;
    }

    public void setFotoEdu(String fotoEdu) {
        this.fotoEdu = fotoEdu;
    }

}
