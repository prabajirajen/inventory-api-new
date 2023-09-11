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
	ProductDao productDao;
	
	@Override
	public Map<String, Object> getProductSave(Product product) {
	
		return productDao.findSaveProduct(product);
	}

	@Override
	public Catagory saveCatagory(Catagory cg) {
		// TODO Auto-generated method stub
		return productDao.saveCatagory(cg);
	}

	@Override
	public List<Catagory> getAllCatagory() 
	{
		return productDao.getAllCatagory();
	}

	@Override
	public SubCatagory saveSubCatagory(SubCatagory saveCatagory) 
	{
		return productDao.saveSubCatagory(saveCatagory);
	}

}
