package org.astrox.orderservice;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientBeans {


    @Bean
    @LoadBalanced
    public RestClient restClient() {
        return RestClient.builder()
                .baseUrl("lb://product-service")
                .build();
    }
}
