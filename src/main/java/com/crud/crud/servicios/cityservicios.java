package com.crud.crud.servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.entidad.city;
import com.crud.crud.repositorio.cityrepositorio;

@Service
public class cityservicios {
    @Autowired cityrepositorio cityrepositorio;
    public cityservicios(){
        
    }
    public List<city> getCities(){
        return cityrepositorio.findAll(); 
    }
    public city SaveCity(city city) {
         return cityrepositorio.save(city);
    }
    public city getCity(String cityname) {
        return cityrepositorio.findByCityname(cityname);
    }
}
