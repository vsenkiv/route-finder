package com.routefinder.routefinder.service;

import com.routefinder.routefinder.dto.CityRouteDTO;
import com.routefinder.routefinder.dto.ShortestWayContainer;
import es.usc.citius.hipster.algorithm.Algorithm;
import es.usc.citius.hipster.algorithm.Hipster;
import es.usc.citius.hipster.graph.GraphBuilder;
import es.usc.citius.hipster.graph.GraphSearchProblem;
import es.usc.citius.hipster.graph.HipsterDirectedGraph;
import es.usc.citius.hipster.model.problem.SearchProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class RouteFinder implements IShortestFinder{

    @Autowired
    private CityRouteClient cityRouteClient;

    @Override
    public ShortestWayContainer calculateTheShortestWay(String city) {
        Iterable<CityRouteDTO> allEdges = cityRouteClient.cityRoutes();
        ShortestWayContainer result = new ShortestWayContainer();

        // calculate the routes based on the time interval
        GraphBuilder<String, Long> graphBuilder = GraphBuilder.<String, Long>create();
        StreamSupport.stream(allEdges.spliterator(), false).forEach(edge -> graphBuilder.connect(edge.getCity()).to(edge.getDestinyCity())
            .withEdge(edge.getArrivalTime().getTime() - edge.getDepartureTime().getTime()));

        HipsterDirectedGraph<String, Long> graph = graphBuilder.createDirectedGraph();
        SearchProblem p = GraphSearchProblem
            .startingFrom(allEdges.iterator().next().getCity())
            .in(graph)
            .takeCostsFromEdges()
            .build();

        Algorithm.SearchResult optimalPathByTime =  Hipster.createDijkstra(p).search(city);
        result.setShortestRoutesByTimeInterval((List<String>)optimalPathByTime.getOptimalPaths().get(0));

        // calculate the routes based on the distance
        GraphBuilder<String, Double> graphBuilderByDistance = GraphBuilder.<String, Double>create();
        StreamSupport.stream(allEdges.spliterator(), false).forEach(edge -> graphBuilderByDistance.connect(edge.getCity()).to(edge.getDestinyCity())
            .withEdge(edge.getDistance()));

        HipsterDirectedGraph<String, Double> graphByDistance = graphBuilderByDistance.createDirectedGraph();
        SearchProblem pByDistance = GraphSearchProblem
            .startingFrom(allEdges.iterator().next().getCity())
            .in(graphByDistance)
            .takeCostsFromEdges()
            .build();

        Algorithm.SearchResult optimalPathByDistance =  Hipster.createDijkstra(pByDistance).search(city);
        result.setShortestRoutesByDistance((List<String>)optimalPathByDistance.getOptimalPaths().get(0));

        return result;
    }
}
