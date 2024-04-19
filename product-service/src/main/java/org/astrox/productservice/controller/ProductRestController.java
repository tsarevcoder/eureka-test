package org.astrox.productservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductRestController {



    @GetMapping("/product")
    public ResponseEntity<String> findAllProduct() {
        return ResponseEntity.ok("product!");
    }
}
