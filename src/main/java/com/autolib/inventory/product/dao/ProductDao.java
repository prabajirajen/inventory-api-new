package com.autolib.inventory.product.dao;

import java.util.List;
import java.util.Map;

import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;

public interface ProductDao {

	public Map<String, Object> findSaveProduct(Product product);

	public Catagory saveCatagory(Catagory cg);

<<<<<<< Updated upstream
	public List<Catagory> getAllCatagory();

	public SubCatagory saveSubCatagory(SubCatagory saveCatagory);
=======
	Map<String, Object> deleteProduct(String productId);
	
	public Catagory saveCatagory(Catagory cg);

	public Map<String, Object> getAllCatagory();

	public SubCatagory saveSubCatagory(SubCatagory saveCatagory);

	Map<String, Object> getAllSubCatagory();

	Map<String, Object> getCatagoryById(int cid);

	 Map<String, Object>  getSubCatagoryByIdProduct(int saveCatagory);

	Map<String, Object> getCatagoryByIdProduct(int catagoryId);

	Map<String, Object> getProductById(long pId);

	Map<String, Object> updateProduct(Product product);

	 Map<String, Object> getSubCatagoryByCId(int cid);

	 Map<String, Object>  getSubCatagoryByScId(int saveCatagory);

	 Map<String, Object> getCatagoryByCid(int catagoryId);
>>>>>>> Stashed changes

}
