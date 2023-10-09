package com.crud.crud.entidad;



import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "cities")
public class city {
    @Id
    @Column(name = "id_city")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    @Column(name = "city_name")
    private String cityname;

    
    @Column(name = "city_code", columnDefinition ="character varying(3) not null default 'NA' "   )
    private String citycode;

    @Transient
    private String beanid;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private country country;


    

    public String getBeanid() {
        return beanid;
    }

    public void setBeanid(String beanid) {
        this.beanid = beanid;
    }

    public country getCountry() {
        return country;
    }

    public void setCountry(country country) {
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }
    
}
