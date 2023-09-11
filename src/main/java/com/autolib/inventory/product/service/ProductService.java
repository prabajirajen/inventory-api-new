package com.autolib.inventory.product.service;

import java.util.List;
import java.util.Map;

import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;

public interface ProductService {

	public Map<String, Object> getProductSave(Product product);

	public Catagory saveCatagory(Catagory cg);

	public List<Catagory> getAllCatagory();

	public SubCatagory saveSubCatagory(SubCatagory saveCatagory);

}
