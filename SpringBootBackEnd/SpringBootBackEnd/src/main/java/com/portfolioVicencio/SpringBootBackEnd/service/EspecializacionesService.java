package com.portfolioVicencio.SpringBootBackEnd.service;


import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import com.portfolioVicencio.SpringBootBackEnd.repository.EspecializacionesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class EspecializacionesService {
    
    @Autowired
    EspecializacionesRepository especializacionesRepository;
    
    public List<Especializaciones> list() {
        return especializacionesRepository.findAll();
    }

    public Optional<Especializaciones> getOne(int id) {
        return especializacionesRepository.findById(id);
    }

    public Optional<Especializaciones> getByNombreEspe(String nombreEspe) {
        return especializacionesRepository.findByNombreEspe(nombreEspe);
    }

    public void save(Especializaciones especializaciones) {
        especializacionesRepository.save(especializaciones);
    }

    public void delete(int id) {
        especializacionesRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return especializacionesRepository.existsById(id);
    }

    public boolean existsByNombre(String nombreEspe) {
        return especializacionesRepository.existsByNombreEspe(nombreEspe);
    }
}