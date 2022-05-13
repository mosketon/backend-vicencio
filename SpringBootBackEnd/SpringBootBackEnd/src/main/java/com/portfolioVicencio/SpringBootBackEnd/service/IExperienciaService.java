package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List <Experiencia> verExperiencia ();
    public void crearExperiencia (Experiencia expe);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    
}
