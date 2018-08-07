package com.routefinder.citymanager.rest;

import static org.springframework.http.HttpStatus.CREATED;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.routefinder.citymanager.model.CityRoute;
import com.routefinder.citymanager.repository.CityRouteRepository;
import com.routefinder.citymanager.validator.CityRouteValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController()
public class CityRouteController {

    private CityRouteRepository repository;
    private CityRouteValidator validator;

    @Autowired
    public CityRouteController(CityRouteRepository cityRouteRepository, CityRouteValidator cityRouteValidator) {
        this.repository = cityRouteRepository;
        this.validator = cityRouteValidator;
    }

    @GetMapping("api/routes")
    @HystrixCommand(fallbackMethod = "emptyList")
    public Iterable<CityRoute> cityRoutes() {
        return repository.findAll();
    }

    @GetMapping("/api/routes/{id}")
    public CityRoute cityRouteByRouteId(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @GetMapping("api/routes/cities/{city}")
    public Iterable<CityRoute> cityRouteByCity(@PathVariable String city) {
        return repository.findByCity(city);
    }

    @GetMapping("api/routes/destinations/{destinyCity}")
    public Iterable<CityRoute> cityRouteByDestinyCity(@PathVariable String destinyCity) {
        return repository.findByDestinyCity(destinyCity);
    }

    @PostMapping
    public ResponseEntity<CityRoute> addRoute(@RequestBody CityRoute cityRoute) {
        validator.validate(cityRoute);
        return new ResponseEntity<>(repository.save(cityRoute), CREATED);
    }

    @DeleteMapping("api/routes/{id}")
    public void deleteRoute(@PathVariable Integer id) {
        repository.delete(id);
    }

    private List<CityRoute> emptyList(){
        return Collections.emptyList();
    }
}
