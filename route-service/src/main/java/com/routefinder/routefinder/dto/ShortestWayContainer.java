package com.routefinder.routefinder.dto;

import java.util.List;

public class ShortestWayContainer {

    private List<String> shortestRoutesByDistance;
    private List<String> shortestRoutesByTimeInterval;

    public ShortestWayContainer(){

    }

    public ShortestWayContainer(List<String> shortestRoutesByDistance,
                                List<String> shortestRoutesByTimeInterval) {
        this.shortestRoutesByDistance = shortestRoutesByDistance;
        this.shortestRoutesByTimeInterval = shortestRoutesByTimeInterval;
    }

    public List<String> getShortestRoutesByDistance() {
        return shortestRoutesByDistance;
    }

    public void setShortestRoutesByDistance(List<String> shortestRoutesByDistance) {
        this.shortestRoutesByDistance = shortestRoutesByDistance;
    }

    public List<String> getShortestRoutesByTimeInterval() {
        return shortestRoutesByTimeInterval;
    }

    public void setShortestRoutesByTimeInterval(List<String> shortestRoutesByTimeInterval) {
        this.shortestRoutesByTimeInterval = shortestRoutesByTimeInterval;
    }
}
