 package com.portfolioVicencio.SpringBootBackEnd.Interface;

import com.portfolioVicencio.SpringBootBackEnd.model.Persona;
import java.util.List;
 
public interface IPersonaService {
    
    //Traer lista de personas
    public List<Persona> getPersona ();
    //Guardar persona
    public void savePersona (Persona persona);
    //Eliminar persona por ID
    public void deletePersona (Long id);
    //Buscar persona
    public Persona findPersona (Long id);
    
    
}
