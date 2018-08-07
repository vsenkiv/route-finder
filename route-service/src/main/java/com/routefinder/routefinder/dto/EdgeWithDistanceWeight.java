package com.routefinder.routefinder.dto;

public class EdgeWithDistanceWeight {

    private Edge edge;
    private int distance;

    public EdgeWithDistanceWeight(Edge edge, int distance) {
        this.edge = edge;
        this.distance = distance;
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
