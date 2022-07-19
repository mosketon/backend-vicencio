package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import com.portfolioVicencio.SpringBootBackEnd.repository.HabilidadesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService {
    
    @Autowired
    HabilidadesRepository habilidadesRepository;
    
    public List<Habilidades> list() {
        return habilidadesRepository.findAll();
    }

    public Optional<Habilidades> getOne(int id) {
        return habilidadesRepository.findById(id);
    }

    public Optional<Habilidades> getByNombreHabi(String nombreHabi) {
        return habilidadesRepository.findByNombreHabi(nombreHabi);
    }

    public void save(Habilidades habilidades) {
        habilidadesRepository.save(habilidades);
    }

    public void delete(int id) {
        habilidadesRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return habilidadesRepository.existsById(id);
    }

    public boolean existsByNombre(String nombreHabi) {
        return habilidadesRepository.existsByNombreHabi(nombreHabi);
    }
}
