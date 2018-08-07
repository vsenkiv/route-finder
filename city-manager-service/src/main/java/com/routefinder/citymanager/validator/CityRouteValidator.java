package com.routefinder.citymanager.validator;

import com.routefinder.citymanager.exception.CityRouteAlreadyExistsException;
import com.routefinder.citymanager.exception.InvalidTimeRangeException;
import com.routefinder.citymanager.model.CityRoute;
import com.routefinder.citymanager.repository.CityRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityRouteValidator {

    private CityRouteRepository repository;

    @Autowired
    public CityRouteValidator(CityRouteRepository repository) {
        this.repository = repository;
    }

    public void validate(CityRoute cityRoute) {
        if (repository.findByCityAndDestintyCity(cityRoute.getCity(), cityRoute.getDestinyCity()) != null) {
            throw new CityRouteAlreadyExistsException(
                String.format("City route from %s to %s already exists", cityRoute.getCity(), cityRoute.getDestinyCity()));
        }

        if (cityRoute.getDepartureTime().isBefore(cityRoute.getArrivalTime())) {
            throw new InvalidTimeRangeException("Departure time is before the arrival time");
        }
    }
}
