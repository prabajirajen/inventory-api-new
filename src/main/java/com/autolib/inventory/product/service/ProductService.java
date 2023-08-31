package com.autolib.inventory.product.service;

import java.util.Map;

import com.autolib.inventory.product.entity.Product;

public interface ProductService {

	Map<String, Object> addProduct(Product product);

}
