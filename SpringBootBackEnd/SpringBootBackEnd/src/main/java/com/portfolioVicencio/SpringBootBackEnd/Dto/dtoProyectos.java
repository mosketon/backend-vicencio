package com.portfolioVicencio.SpringBootBackEnd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {

    @NotBlank
    private String nombrePro;
    @NotBlank
    private String descripcionPro;
    private String fotoPro;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombrePro, String descripcionPro, String fotoPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fotoPro = fotoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getFotoPro() {
        return fotoPro;
    }

    public void setFotoPro(String fotoPro) {
        this.fotoPro = fotoPro;
    }
    
    
}
