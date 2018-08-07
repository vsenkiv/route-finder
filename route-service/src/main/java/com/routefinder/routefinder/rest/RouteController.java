package com.routefinder.routefinder.rest;

import com.routefinder.routefinder.dto.ShortestWayContainer;
import com.routefinder.routefinder.service.RouteFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/route-from-the-start-city")
public class RouteController {

    private RouteFinder finder;

    @Autowired
    public RouteController(RouteFinder finder) {
        this.finder = finder;
    }

    @GetMapping("/to/{city}")
    public ShortestWayContainer findRoute(@PathVariable String city) {
        return finder.calculateTheShortestWay(city);
    }
}
