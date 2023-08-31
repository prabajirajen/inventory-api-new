package com.autolib.inventory.product.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Map<String, Object> addProduct(Product product) {
		Map<String, Object> resp = new HashMap<>();
		try {
			
			Product _product = productRepository.findByProductId(product.getId());

		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
