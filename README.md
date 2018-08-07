# route-finder
This is the example of microservices that are responsible for calculating the shortest way btw cities based on distance btw them and the time which is needed to get from one city to another. 

There are two business services: 
- city-manager-service: responsible for performing CRUD operations on cities and the routes among them
- route-service: exposes of REST endpoint to calculate the optimal path from the start node to the requested destnation node 

# microservices infrastructure 

In this sample is used Spring Boot together with Spring Cloud stack. These are Spring Zuul, Spring Cloud Config, Spring Eureka, Spring Hystrix and Spring Feigh. 

