package com.autolib.inventory.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.service.ProductService;



@RestController
@RequestMapping("product")
@CrossOrigin("*")
public class ProductController {

	
private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private ProductService productService;
		
	@PostMapping("add-product")
	public ResponseEntity<?> getProductSave(@RequestBody Product product) throws Exception  {

		logger.info("getProductSave starts:::");
		
		Map<String, Object> resp = new HashMap<>();
		try {
			resp = productService.getProductSave(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("getProductSave ends:::");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	
	@PostMapping("get-all-product")
	public ResponseEntity<?> getAllProduct() throws Exception  {

		logger.info("getAllProduct starts:::");
		
		Map<String, Object> resp = new HashMap<>();
		try {
			resp = productService.getAllProduct();
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("getAllProduct ends:::");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@PostMapping("delete-product")
	public ResponseEntity<?> deleteProduct(@RequestBody Product product) {
		logger.info("deleteProduct starts:::" + product);
		Map<String, Object> resp = new HashMap<>();

		try {
			resp = productService.deleteProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("productId ends:::" + resp);
		return new ResponseEntity<>(resp, HttpStatus.OK);

	}
	
	
	
	
}
