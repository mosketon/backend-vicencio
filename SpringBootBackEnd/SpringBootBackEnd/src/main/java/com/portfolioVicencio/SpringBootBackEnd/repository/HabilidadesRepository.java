package com.portfolioVicencio.SpringBootBackEnd.repository;

import com.portfolioVicencio.SpringBootBackEnd.model.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Integer>{
    public Optional<Habilidades> findByNombreHabi(String nombreHabi);
    public boolean existsByNombreHabi(String nombreHabi);
    
}
