package com.routefinder.routefinder.service;

import com.routefinder.routefinder.dto.CityRouteDTO;
import com.routefinder.routefinder.dto.ShortestWayContainer;
import es.usc.citius.hipster.algorithm.Hipster;
import es.usc.citius.hipster.graph.GraphBuilder;
import es.usc.citius.hipster.graph.GraphSearchProblem;
import es.usc.citius.hipster.graph.HipsterDirectedGraph;
import es.usc.citius.hipster.model.problem.SearchProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class RouteFinder {

    @Autowired
    private CityRouteClient cityRouteClient;

    public ShortestWayContainer calculateTheShortestWay(String city) {
        Iterable<CityRouteDTO> allEdges = cityRouteClient.cityRoutes();


//        HipsterDirectedGraph<String, Double> graph =
//            GraphBuilder.<String, Double>create()
//                .connect("A").to("B").withEdge(4d)
//                .connect("A").to("C").withEdge(2d)
//                .connect("B").to("C").withEdge(5d)
//                .connect("B").to("D").withEdge(10d)
//                .connect("C").to("E").withEdge(3d)
//                .connect("D").to("F").withEdge(11d)
//                .connect("E").to("D").withEdge(4d)
//                .createDirectedGraph();
//
//// Create the search problem. For graph problems, just use
//// the GraphSearchProblem util class to generate the problem with ease.
//        SearchProblem p = GraphSearchProblem
//            .startingFrom("A")
//            .in(graph)
//            .takeCostsFromEdges()
//            .build();
//
//// Search the shortest path from "A" to "F"
//        System.out.println(Hipster.createDijkstra(p).search("F"));
        // build graph
        return new ShortestWayContainer();
    }
}
