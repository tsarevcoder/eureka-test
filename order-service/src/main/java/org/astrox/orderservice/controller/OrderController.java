package org.astrox.orderservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {


    private final RestClient restClient;

    public OrderController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/order")
    public ResponseEntity<String> findAllOrders() {
        String order = restClient.get()
                .uri("/api/v1/products/product")
                .retrieve()
                .body(String.class);

        return ResponseEntity.ok(order);
    }

}
