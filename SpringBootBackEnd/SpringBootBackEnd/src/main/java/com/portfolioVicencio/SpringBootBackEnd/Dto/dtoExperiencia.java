package com.portfolioVicencio.SpringBootBackEnd.Dto;

import javax.validation.constraints.NotBlank;

 
public class dtoExperiencia {
    @NotBlank
    private String nombreEx;
    @NotBlank
    private String descripcionEx;
    private String fotoEx;
    
    //Const

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEx, String descripcionEx, String fotoEx) {
        this.nombreEx = nombreEx;
        this.descripcionEx = descripcionEx;
        this.fotoEx = fotoEx;
    }
    
    // G&S

    public String getNombreEx() {
        return nombreEx;
    }

    public void setNombreEx(String nombreEx) {
        this.nombreEx = nombreEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }

    public String getFotoEx() {
        return fotoEx;
    }

    public void setFotoEx(String fotoEx) {
        this.fotoEx = fotoEx;
    }
    
    
    
}
