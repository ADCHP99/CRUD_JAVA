package com.crud.crud.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entidad.city;
import com.crud.crud.servicios.cityservicios;

@RestController
public class Controlador {
    
    @Autowired
    cityservicios cityservicios;

    @GetMapping("Hola")
    public String Hola(){
        return "Hola";
    }

    @GetMapping("getcities")
    public List<city> getCities(){
       return  cityservicios.getCities();
    }
    @PostMapping("addcity")
    public city SaveCity(@RequestBody city city){
        return  cityservicios.SaveCity(city);

    }
    @GetMapping("getcity")
    public city getCity(String cityname){
        return cityservicios.getCity(cityname);
    }
}
