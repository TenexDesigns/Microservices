Yes, typically you would create a separate Spring Boot application for the API Gateway. This application will act as the entry point for your microservices and handle the routing, security, load balancing, and other concerns. Here's how you can set up an API Gateway for your existing context of the catalogue microservice, review microservice, and Eureka server:

**Step 1: Create a New Spring Boot Application for API Gateway**

1. Create a new Spring Boot project using your preferred IDE.
2. Add the necessary dependencies, such as `spring-cloud-starter-gateway`, in your project's `pom.xml`.

**Step 2: Configure API Gateway Routes**

In your API Gateway application, you'll define routes that map to your catalogue and review microservices. Here's a basic example of how you can configure routes using Spring Cloud Gateway:

```java
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("catalogue-service-route", r ->
                r.path("/catalogue/**")
                 .uri("lb://catalogue-service")
            )
            .route("reviews-service-route", r ->
                r.path("/reviews/**")
                 .uri("lb://reviews-service")
            )
            .build();
    }
}
```

In the above example, `catalogue-service` and `reviews-service` are the service names registered with Eureka. The `lb://` prefix indicates that load balancing should be performed.

**Step 3: Run Your API Gateway**

Start your API Gateway application alongside your other microservices and the Eureka server. The API Gateway will handle incoming requests, route them to the appropriate microservices, and perform any necessary load balancing or other configured operations.

**Step 4: Configure Microservices for API Gateway**

In your existing microservices (`catalogue-service` and `reviews-service`), you don't need to make significant changes. Continue using Feign clients as you've already set up, and the API Gateway will handle the routing.

**Step 5: Register API Gateway with Eureka**

In your API Gateway's `application.properties` (or `application.yml`), configure the Eureka server settings for registration:

```properties
spring.application.name=api-gateway
eureka.client.service-url.default-zone=http://localhost:8761/eureka/
```

**Step 6: Test Your API Gateway**

You can now test your API Gateway by sending requests to its routes. For example, if your API Gateway is running on port 8080, you can send requests like:

- `http://localhost:8080/catalogue/books` (Routed to `catalogue-service`)
- `http://localhost:8080/reviews/1` (Routed to `reviews-service`)

Remember that this is a basic setup, and you can extend the API Gateway to include security, rate limiting, and other features based on your requirements.

By creating a separate Spring Boot application for the API Gateway, you keep the concerns of routing, load balancing, and security separate from your individual microservices, providing a more organized and manageable architecture.
