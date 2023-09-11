package com.autolib.inventory.product.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;
import com.autolib.inventory.product.repository.CatagoryRepository;
import com.autolib.inventory.product.repository.ProductRepository;
import com.autolib.inventory.product.repository.SubCatagoryRepository;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CatagoryRepository catagoryRepository;
	@Autowired
	private SubCatagoryRepository subCatagoryRepository;

	@Override
	public Map<String, Object> findSaveProduct(Product product) {
		Map<String, Object> resp = new HashMap<String, Object>();
		
		
		try {
			
		Product product2=	productRepository.save(product);
			
		resp.put("Data", product2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return resp;
	}

	@Override
	public Catagory saveCatagory(Catagory cg) 
	{
		System.out.println(cg.getcName()+"inside dao impl:::::::::::::::::::");
		Catagory ob=null;
		try
		{
			ob=catagoryRepository.save(cg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	}

	@Override
	public List<Catagory> getAllCatagory() {
		return catagoryRepository.findAll();
	}

	@Override
	public SubCatagory saveSubCatagory(SubCatagory saveCatagory) 
	{
		System.out.println(saveCatagory.getcId()+"::::::::cid");
		SubCatagory sbc=null;
		try
		{
			sbc=subCatagoryRepository.save(saveCatagory);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sbc;
	}

}
