package com.ecommerce.product_service.service;

import com.ecommerce.product_service.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product save(Product product);
}
