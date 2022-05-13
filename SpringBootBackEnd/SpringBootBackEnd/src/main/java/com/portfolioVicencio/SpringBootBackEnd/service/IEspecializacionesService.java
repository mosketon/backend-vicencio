package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import java.util.List;



public interface IEspecializacionesService {
    
    public List <Especializaciones> verEspecializaciones ();
    public void crearEspecializaciones (Especializaciones esp);
    public void borrarEspecializaciones (Long id);
    public Especializaciones buscarEspecializaciones (Long id);
    
}
