package com.mateus.api.service;

import com.mateus.api.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Notebook", 3500.0));
        products.add(new Product(2L, "Mouse Gamer", 120.0));
    }

    public List<Product> findAll() {
        return products;
    }
}
