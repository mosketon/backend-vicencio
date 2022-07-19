package com.portfolioVicencio.SpringBootBackEnd.Interface;

import com.portfolioVicencio.SpringBootBackEnd.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List <Educacion> verEducación ();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
}
