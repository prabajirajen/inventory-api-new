package com.autolib.inventory.product.dao;

import java.util.Map;

import com.autolib.inventory.product.entity.Product;

public interface ProductDao {

	Map<String, Object> addProduct(Product product);

}
