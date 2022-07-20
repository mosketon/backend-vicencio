package com.portfolioVicencio.SpringBootBackEnd.service;

import com.portfolioVicencio.SpringBootBackEnd.model.Persona;
import com.portfolioVicencio.SpringBootBackEnd.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> list() {
        return personaRepository.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return personaRepository.findById(id);
    }

    public Optional<Persona> getByApellido(String apellido) {
        return personaRepository.findByApellido(apellido);
    }

    public void save(Persona persona) {
        personaRepository.save(persona);
    }

    public void delete(int id) {
        personaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return personaRepository.existsById(id);
    }

    public boolean existsByApellido(String apellido) {
        return personaRepository.existsByApellido(apellido);
    }


    
}
