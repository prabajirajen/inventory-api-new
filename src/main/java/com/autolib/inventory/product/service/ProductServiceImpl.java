package com.autolib.inventory.product.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autolib.inventory.product.dao.ProductDao;
import com.autolib.inventory.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public Map<String, Object> addProduct(Product product) {
		
		return productDao.addProduct(product);
	}

}
