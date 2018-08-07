package com.routefinder.citymanager.repository;

import com.routefinder.citymanager.model.CityRoute;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CityRouteRepository extends PagingAndSortingRepository<CityRoute, Integer> {

    List<CityRoute> findByCity(String city);

    List<CityRoute> findByDestintyCity(String city);

    CityRoute findByCityAndDestintyCity(String city, String destinyCity);
}
