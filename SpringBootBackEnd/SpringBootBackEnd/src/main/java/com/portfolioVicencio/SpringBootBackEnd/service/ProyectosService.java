package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Proyectos;
import com.portfolioVicencio.SpringBootBackEnd.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    
   @Autowired
    ProyectosRepository proyectosRepository;
    
    public List<Proyectos> list() {
        return proyectosRepository.findAll();
    }

    public Optional<Proyectos> getOne(int id) {
        return proyectosRepository.findById(id);
    }

    public Optional<Proyectos> getByNombrePro(String nombrePro) {
        return proyectosRepository.findByNombrePro(nombrePro);
    }

    public void save(Proyectos proyectos) {
        proyectosRepository.save(proyectos);
    }

    public void delete(int id) {
        proyectosRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return proyectosRepository.existsById(id);
    }

    public boolean existsByNombre(String nombrePro) {
        return proyectosRepository.existsByNombrePro(nombrePro);
    }
    
}
