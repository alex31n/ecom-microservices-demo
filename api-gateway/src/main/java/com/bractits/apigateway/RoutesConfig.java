package com.bractits.apigateway;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("product", p -> p.path("/product/**")
                        .filters(f -> f.rewritePath("/product/(?<segment>.*)", "/${segment}"))
                        .uri("lb://PRODUCT-SERVICE")
                )
                .build();
    }
}
