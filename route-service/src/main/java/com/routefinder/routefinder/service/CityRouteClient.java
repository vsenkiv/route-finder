package com.routefinder.routefinder.service;

import com.routefinder.routefinder.dto.CityRouteDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("${city-manager-service.name}")
public interface CityRouteClient {

    @GetMapping("api/routes")
    Iterable<CityRouteDTO> cityRoutes();
}
