package com.routefinder.routefinder.dto;

public class EdgeWithTimeWeight {

    private Edge edge;
    private Long timeInterval;

    public EdgeWithTimeWeight(Edge edge, Long timeInterval) {
        this.edge = edge;
        this.timeInterval = timeInterval;
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    public Long getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
    }
}
