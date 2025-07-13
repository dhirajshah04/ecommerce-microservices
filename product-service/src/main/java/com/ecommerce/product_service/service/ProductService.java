package com.ecommerce.product_service.service;

import com.ecommerce.product_service.dto.ProductRequestDto;
import com.ecommerce.product_service.dto.ProductResponseDTO;
import com.ecommerce.product_service.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product save(Product product);

    ProductResponseDTO createProduct(ProductRequestDto dto);
}
