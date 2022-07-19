package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.Interface.IEspecializacionesService;
import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.repository.EspecializacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EspecializacionesService implements IEspecializacionesService {
    
    @Autowired
    public EspecializacionesRepository espRepo;

    @Override
    public List<Especializaciones> verEspecializaciones() {
     return espRepo.findAll();
    }

    @Override
    public void crearEspecializaciones(Especializaciones esp) {
     espRepo.save(esp);
    }

    @Override
    public void borrarEspecializaciones(Long id) {
     espRepo.deleteById(id);
    }

    @Override
    public Especializaciones buscarEspecializaciones(Long id) {
     return espRepo.findById(id).orElse(null);
    }
    
}
