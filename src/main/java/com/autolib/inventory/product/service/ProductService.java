package com.autolib.inventory.product.service;

import java.util.Map;

import com.autolib.inventory.product.entity.Product;

public interface ProductService {

	Map<String, Object> getProductSave(Product product);

	Map<String, Object> getAllProduct();

	Map<String, Object> deleteProduct(Product product);

}
