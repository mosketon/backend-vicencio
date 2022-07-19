
package com.portfolioVicencio.SpringBootBackEnd.service;


import com.portfolioVicencio.SpringBootBackEnd.model.Educacion;
import com.portfolioVicencio.SpringBootBackEnd.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class EducacionService  {
    @Autowired
    EducacionRepository educacionRepository;
    
    public List<Educacion> list() {
        return educacionRepository.findAll();
    }

    public Optional<Educacion> getOne(int id) {
        return educacionRepository.findById(id);
    }

    public Optional<Educacion> getByNombreEdu(String nombreEdu) {
        return educacionRepository.findByNombreEdu(nombreEdu);
    }

    public void save(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    public void delete(int id) {
        educacionRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return educacionRepository.existsById(id);
    }

    public boolean existsByNombre(String nombreEdu) {
        return educacionRepository.existsByNombreEdu(nombreEdu);
    }
}

    