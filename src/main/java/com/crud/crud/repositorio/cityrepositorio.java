package com.crud.crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crud.entidad.city;
@Repository
public interface cityrepositorio  extends JpaRepository<city,Long>{

    city findByCityname(String cityname);

    
}
