package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    public List <Habilidades> verHabilidades();
    public void crearHabilidades(Habilidades hab);
    public void borrarHabilidades(Long id);
    public Habilidades buscarHabilidades(Long id);
}
