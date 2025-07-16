package com.ecommerce.product_service.controller;

import com.ecommerce.product_service.dto.ProductRequestDto;
import com.ecommerce.product_service.dto.ProductResponseDTO;
import com.ecommerce.product_service.entity.Product;
import com.ecommerce.product_service.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

//    @PostMapping
//    public Product save(@Valid @RequestBody Product product) {
//        return productService.save(product);
//    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDto dto) {
        ProductResponseDTO created = productService.createProduct(dto);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/test")
    public String test() {
        return "Product service OK";
    }

}
