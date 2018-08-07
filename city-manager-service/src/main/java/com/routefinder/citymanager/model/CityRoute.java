package com.routefinder.citymanager.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
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

    private Double distance;

    private String city;

    private String destinyCity;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalTime;

    public CityRoute() {
    }

    public CityRoute(String city, String destinyCity, Date departureTime, Date arrivalTime, Double distance) {
        this.city = city;
        this.destinyCity = destinyCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distance = distance;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
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

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
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
               Objects.equals(getArrivalTime(), cityRoute.getArrivalTime()) &&
               Objects.equals(getDistance(), cityRoute.getDistance());
    }

    @Override public int hashCode() {

        return Objects.hash(getDestinyCity(), getDepartureTime(), getArrivalTime(), getDistance());
    }
}
