package com.routefinder.citymanager.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cityroute")
public class CityRoute {

    @Id
    @GeneratedValue
    private Integer id;

    private String city;
    private String destinyCity;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime departureTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime arrivalTime;

    public CityRoute() {
    }

    public CityRoute(String city, String destinyCity, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.city = city;
        this.destinyCity = destinyCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Integer getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getDestinyCity() {
        return destinyCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDestinyCity(String destinyCity) {
        this.destinyCity = destinyCity;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CityRoute)) {
            return false;
        }
        CityRoute cityRoute = (CityRoute) o;
        return Objects.equals(getCity(), cityRoute.getCity()) &&
               Objects.equals(getDestinyCity(), cityRoute.getDestinyCity()) &&
               Objects.equals(getDepartureTime(), cityRoute.getDepartureTime()) &&
               Objects.equals(getArrivalTime(), cityRoute.getArrivalTime());
    }

    @Override public int hashCode() {

        return Objects.hash(getDestinyCity(), getDepartureTime(), getArrivalTime());
    }
}