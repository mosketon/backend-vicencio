package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.Interface.IHabilidadesService;
import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import com.portfolioVicencio.SpringBootBackEnd.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habiRepo;

    @Override
    public List<Habilidades> verHabilidades() {
     return habiRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades hab) {
     habiRepo.save(hab);
    }

    @Override
    public void borrarHabilidades(Long id) {
     habiRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
     return habiRepo.findById(id).orElse(null);
    }
    
}
