package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Experiencia;
import com.portfolioVicencio.SpringBootBackEnd.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> list() {
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return experienciaRepository.findById(id);
    }

    public Optional<Experiencia> getByNombreE(String nombreEx) {
        return experienciaRepository.findByNombreEx(nombreEx);
    }

    public void save(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    public void delete(int id) {
        experienciaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return experienciaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombreEx) {
        return experienciaRepository.existsByNombreEx(nombreEx);
    }

}
