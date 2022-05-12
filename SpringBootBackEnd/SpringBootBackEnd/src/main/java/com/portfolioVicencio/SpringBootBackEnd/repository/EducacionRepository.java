
package com.portfolioVicencio.SpringBootBackEnd.repository;

import com.portfolioVicencio.SpringBootBackEnd.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
