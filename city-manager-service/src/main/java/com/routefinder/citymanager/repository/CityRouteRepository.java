package com.routefinder.citymanager.repository;

import com.routefinder.citymanager.model.CityRoute;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CityRouteRepository extends PagingAndSortingRepository<CityRoute, Integer> {

    List<CityRoute> findByCity(String city);

    List<CityRoute> findByDestinyCity(String city);

    CityRoute findByCityAndDestinyCity(String city, String destinyCity);
}
