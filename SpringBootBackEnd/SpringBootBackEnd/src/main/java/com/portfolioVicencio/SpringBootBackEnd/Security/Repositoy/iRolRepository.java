package com.portfolioVicencio.SpringBootBackEnd.Security.Repositoy;

import com.portfolioVicencio.SpringBootBackEnd.Security.Entity.Rol;
import com.portfolioVicencio.SpringBootBackEnd.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional <Rol> findByRolNombre(RolNombre rolNombre);
    
}
