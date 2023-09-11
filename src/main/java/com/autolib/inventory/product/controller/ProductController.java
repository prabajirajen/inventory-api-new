package com.autolib.inventory.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;
import com.autolib.inventory.product.service.ProductService;



@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	
private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private ProductService productService;
		
	@PostMapping("add-product")
	public ResponseEntity<?> getProductSave(@RequestBody Product product) throws Exception  {

		logger.info("addproduct starts:::");
		
		Map<String, Object> resp = new HashMap<>();
		try {
			resp = productService.getProductSave(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("addproduct ends:::");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	//save new catagory
	@PostMapping("/saveNewCatagory")
	public Catagory saveCatagory(@RequestBody Catagory catagory)
	{
		return productService.saveCatagory(catagory);
	}
	
	//retrieve all data from catagory
	@GetMapping("/getAllCat")
	public List<Catagory> getAllCatagory()
	{
		return productService.getAllCatagory();
		
	}
	
	//save sub catagory
	@PostMapping("/saveSubCatagory")
	public SubCatagory saveSubCatagory(@RequestBody SubCatagory saveCatagory)
	{
		
		System.out.println(saveCatagory.getcId()+"Catagory Id In Controller");
		return productService.saveSubCatagory(saveCatagory);
	}
	
	
}
