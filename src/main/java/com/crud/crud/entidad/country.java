package com.crud.crud.entidad;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country:id")
    private int id;

    @Column(name="country_name")
    private String country_name;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "country_id")
    private Set<city> cities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Set<city> getCities() {
        return cities;
    }

    public void setCities(Set<city> cities) {
        this.cities = cities;
    }
    

    

}
