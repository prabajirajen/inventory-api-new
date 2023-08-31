package com.autolib.inventory.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.service.ProductService;

@RestController
@RequestMapping("agent")
@CrossOrigin
public class ProductController {
	
	private final Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	ProductService productService;
	
	@PostMapping("save-product")
	public ResponseEntity<?> addProduct( @RequestBody Product product) {
		logger.info("addProduct req starts::" + product);
		Map<String, Object> resp = new HashMap<>();

		try {
			resp = productService.addProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

}
