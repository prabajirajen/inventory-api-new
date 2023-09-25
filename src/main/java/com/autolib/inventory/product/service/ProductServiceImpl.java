package com.autolib.inventory.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autolib.inventory.product.dao.ProductDao;
import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	public ProductDao productDao;
	
	@Override
	public Map<String, Object> getProductSave(Product product) {
	
		return productDao.findSaveProduct(product);
	}

	@Override
	public Map<String, Object> getAllProduct() {
		
		return productDao.getAllProduct();
	}

	@Override
	public Map<String, Object> deleteProduct(Product product) {
		
		return productDao.deleteProduct(product);
	}

	
	@Override
	public Catagory saveCatagory(Catagory cg) {
		// TODO Auto-generated method stub
		return productDao.saveCatagory(cg);
	}

	@Override
	public Map<String, Object> getAllCatagory() 
	{
		return productDao.getAllCatagory();
	}

	@Override
	public SubCatagory saveSubCatagory(SubCatagory saveCatagory) 
	{
		return productDao.saveSubCatagory(saveCatagory);
	}

	@Override
	public Map<String, Object> getAllSubCatagory() {
		
		return productDao.getAllSubCatagory();
	}

	@Override
	public Map<String, Object> getCatagoryById(int cid) {
		
		return productDao.getCatagoryById(cid);
	}

	@Override
	public  Map<String, Object>  getSubCatagoryByIdProduct(int saveCatagory) {
		
		return productDao.getSubCatagoryByIdProduct(saveCatagory);
	}

	@Override
	public Map<String, Object> getCatagoryByIdProduct(int catagoryId) {
		
		return productDao.getCatagoryByIdProduct(catagoryId);
	}

	@Override
	public Map<String, Object> getProductById(long pId) 
	{
		return productDao.getProductById(pId);
	}

	@Override
	public Map<String, Object> updateProduct(Product product) {
		return productDao.updateProduct(product);
	}


	@Override
	public 	List<SubCatagory> getSubCatagoryByCId(int cid) {
		
		return productDao.getSubCatagoryByCId(cid);
	}

	@Override
	public  Map<String, Object>  getSubCatagoryByScId(int saveCatagory) {
		
		return productDao.getSubCatagoryByScId(saveCatagory);
	}

	@Override
	public Map<String, Object> getCatagoryByCid(int catagoryId) {
		
		return productDao.getCatagoryByCid(catagoryId);
	}

}
