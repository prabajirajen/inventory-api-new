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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;
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

		logger.info("getProductSave starts:::"+product);
		
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
	
	
	
	@PostMapping("/get-catagory-byid/{catagoryId}")
	public ResponseEntity<?> getCatagoryById(@PathVariable(name="catagoryId") Integer catagoryId) throws Exception  {

		logger.info("getCatagoryById starts:::");
		
		Map<String, Object> resp = new HashMap<>();
		try {
			System.out.println(catagoryId);
			resp = productService.getCatagoryById(catagoryId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("getCatagoryById ends:::");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/getproductbyid/{pId}")
	public ResponseEntity<?> getProductById(@PathVariable long pId)
	{
		Map<String, Object> resp = new HashMap<>();
		try
		{
			logger.info("getProductById ends:::");
			resp = productService.getProductById(pId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestBody Product product)
	{
		System.out.println(product.getId()+" id from product");
		Map<String, Object> resp = new HashMap<>();
		try 
		{
			logger.info("updateproduct ends:::");
			resp = productService.updateProduct(product);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
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
	
	
	
	//save new catagory
		@PostMapping("/saveNewCatagory")
		public Catagory saveCatagory(@RequestBody Catagory catagory)
		{
			return productService.saveCatagory(catagory);
		}
		
		
		

		//save sub catagory
		@PostMapping("/saveSubCatagory")
		public SubCatagory saveSubCatagory(@RequestBody SubCatagory saveCatagory)
		{
			
			System.out.println(saveCatagory.getcId()+"Catagory Id In Controller");
			return productService.saveSubCatagory(saveCatagory);
		}
		
		
		
		@GetMapping("getAllCat")
		public ResponseEntity<?> getAllCatagory() throws Exception  {

			logger.info("getAllProduct starts:::");
			
			Map<String, Object> resp = new HashMap<>();
			try {
				resp = productService.getAllCatagory();
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("getAllProduct ends:::");
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		
	
		
	
		@PostMapping("get-all-subcatagory")
		public ResponseEntity<?> getAllSubCatagory() throws Exception  {

			logger.info("getAllSubCatagory starts:::");
			
			Map<String, Object> resp = new HashMap<>();
			try {
				resp = productService.getAllSubCatagory();
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("getAllSubCatagory ends:::");
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		
		

		@PostMapping("/get-catagory-by-cid/{cId}")
		public ResponseEntity<?>  getCatagoryByCid(@PathVariable int cId)
		{Map<String, Object> resp = new HashMap<>();
			try {
			logger.info("getCatagoryByIdProduct ends:::");
			System.out.println(cId+"Catagory Id In Controller");
			
			resp = productService.getCatagoryByCid(cId);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("getCatagoryByIdProduct ends:::");
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		

		@PostMapping("/get-subcatagory-by-scid/{sCId}")
		public ResponseEntity<?>  getSubCatagoryByScId(@PathVariable int sCId)
		{Map<String, Object> resp = new HashMap<>();
			try {
				logger.info("getSubCatagoryByIdProduct ends:::");
			System.out.println(sCId+"subcatagoryId Id In Controller");
			
			resp = productService.getSubCatagoryByScId(sCId);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("getSubCatagoryByIdProduct ends:::");
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		
		
		
	@PostMapping("/get-subcatagory-by-cid/{cId}")
	public List<SubCatagory>  getSubCatagoryByCId(@PathVariable Integer cId) throws Exception  {
		
		
		return productService.getSubCatagoryByCId(cId);
	}
	
	
	
	
	
	
	
	
	
	
}
