package com.portfolioVicencio.SpringBootBackEnd.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidades {
    
    @NotBlank
    private String nombreHabi;
    @NotBlank
    private String porcentajeHabi;
    private String fotoHabi;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String nombreHabi, String porcentajeHabi, String fotoHabi) {
        this.nombreHabi = nombreHabi;
        this.porcentajeHabi = porcentajeHabi;
        this.fotoHabi = fotoHabi;
    }

    public String getNombreHabi() {
        return nombreHabi;
    }

    public void setNombreHabi(String nombreHabi) {
        this.nombreHabi = nombreHabi;
    }

    public String getPorcentajeHabi() {
        return porcentajeHabi;
    }

    public void setPorcentajeHabi(String porcentajeHabi) {
        this.porcentajeHabi = porcentajeHabi;
    }

    public String getFotoHabi() {
        return fotoHabi;
    }

    public void setFotoHabi(String fotoHabi) {
        this.fotoHabi = fotoHabi;
    }

   
    
}
