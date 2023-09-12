package com.autolib.inventory.product.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.autolib.inventory.common.utils.GlobleAccessUtil;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
    private Environment environment;


	@Override
	public Map<String, Object> findSaveProduct(Product product) {
		Map<String, Object> resp = new HashMap<String, Object>();
		logger.info("findSaveProduct start:::::::");
		try {
			
			Product _productId=	productRepository.findByProductId(product.getProductId());
					
			if(_productId!=null) {			
				resp.put("StatusDesc", environment.getProperty("PRODUCT.PRODUCT_EXISTS"));
			}
			else {
		    Product product2=	productRepository.save(product);		
	     	resp.put("Data", product2);
	     	resp.putAll(GlobleAccessUtil.successResponse());
	     	logger.info("findSaveProduct end:::::::");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		
		return resp;
	}

	@Override
	public Map<String, Object> getAllProduct() {
		logger.info("getAllProduct start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			
			List<Product> listOfProduct = productRepository.findAll();
			resp.put("listOfProduct", listOfProduct);
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("getAllProduct end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> deleteProduct(Product product) {
		logger.info("deleteProduct start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {

			Product productBean=	productRepository.findByProductId(product.getProductId());
			
			productRepository.delete(productBean);
			
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("deleteProduct end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		return resp;
		
	}

}
