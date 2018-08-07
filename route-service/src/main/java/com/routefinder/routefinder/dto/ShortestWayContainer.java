package com.routefinder.routefinder.dto;

import java.util.List;

public class ShortestWayContainer {

    private List<EdgeWithDistanceWeight> shortestRoutesByDistance;
    private List<EdgeWithTimeWeight> shortestRoutesByTimeInterval;

    public ShortestWayContainer(List<EdgeWithDistanceWeight> shortestRoutesByDistance,
                                List<EdgeWithTimeWeight> shortestRoutesByTimeInterval) {
        this.shortestRoutesByDistance = shortestRoutesByDistance;
        this.shortestRoutesByTimeInterval = shortestRoutesByTimeInterval;
    }

    public List<EdgeWithDistanceWeight> getShortestRoutesByDistance() {
        return shortestRoutesByDistance;
    }

    public void setShortestRoutesByDistance(List<EdgeWithDistanceWeight> shortestRoutesByDistance) {
        this.shortestRoutesByDistance = shortestRoutesByDistance;
    }

    public List<EdgeWithTimeWeight> getShortestRoutesByTimeInterval() {
        return shortestRoutesByTimeInterval;
    }

    public void setShortestRoutesByTimeInterval(List<EdgeWithTimeWeight> shortestRoutesByTimeInterval) {
        this.shortestRoutesByTimeInterval = shortestRoutesByTimeInterval;
    }
}
