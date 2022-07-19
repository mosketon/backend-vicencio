package com.portfolioVicencio.SpringBootBackEnd.repository;

import com.portfolioVicencio.SpringBootBackEnd.model.Especializaciones;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EspecializacionesRepository extends JpaRepository <Especializaciones, Integer>{
    public Optional<Especializaciones> findByNombreEspe(String nombreEspe);
    public boolean existsByNombreEspe(String nombreEspe);
    
}
