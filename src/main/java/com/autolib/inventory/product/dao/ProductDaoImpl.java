package com.autolib.inventory.product.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
=======

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
>>>>>>> Stashed changes
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

<<<<<<< Updated upstream
=======
import com.autolib.inventory.common.utils.GlobleAccessUtil;
>>>>>>> Stashed changes
import com.autolib.inventory.product.entity.Catagory;
import com.autolib.inventory.product.entity.Product;
import com.autolib.inventory.product.entity.SubCatagory;
import com.autolib.inventory.product.repository.CatagoryRepository;
import com.autolib.inventory.product.repository.ProductRepository;
import com.autolib.inventory.product.repository.SubCatagoryRepository;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
<<<<<<< Updated upstream
	private ProductRepository productRepository;
	@Autowired
	private CatagoryRepository catagoryRepository;
	@Autowired
	private SubCatagoryRepository subCatagoryRepository;
=======
	ProductRepository productRepository;
	
	
	
	@Autowired
	private CatagoryRepository catagoryRepository;
	
	@Autowired
	private SubCatagoryRepository subCatagoryRepository;

	@Autowired
	private EntityManager em; 
	
	@Autowired
	JdbcTemplate jdbcTemplate;

>>>>>>> Stashed changes

	@Override
	public Map<String, Object> findSaveProduct(Product productReq) {
		Map<String, Object> resp = new HashMap<String, Object>();
<<<<<<< Updated upstream
		
		
		try {
			
		Product product2=	productRepository.save(product);
			
		resp.put("Data", product2);
			
=======
		logger.info("dao findSaveProduct start:::::::"+productReq);
		try {

			Product _productId=	productRepository.findByProductId(productReq.getProductId());

			if(productReq.getId() ==0 && _productId !=null && productReq.getProductId().equals(_productId.getProductId())) {

				resp.put("StatusDesc", "Product Id Already Exists");
				resp.put("StatusCode", "02");
			}
			else {
				Product productRes=	productRepository.save(productReq);		
				resp.put("Data", productRes);
				resp.putAll(GlobleAccessUtil.successResponse());

				logger.info("findSaveProduct end:::::::");
			}
>>>>>>> Stashed changes
		} catch (Exception e) {
			e.printStackTrace();
		}


		return resp;
	}

	@Override
<<<<<<< Updated upstream
	public Catagory saveCatagory(Catagory cg) 
	{
		System.out.println(cg.getcName()+"inside dao impl:::::::::::::::::::");
		Catagory ob=null;
		try
		{
			ob=catagoryRepository.save(cg);
=======
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
>>>>>>> Stashed changes
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	}

	@Override
<<<<<<< Updated upstream
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
=======
	public Map<String, Object> deleteProduct(String product) {
		logger.info("deleteProduct start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {

			Product productBean=	productRepository.findByProductId(product);
			
			productRepository.delete(productBean);
			
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("deleteProduct end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
>>>>>>> Stashed changes
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sbc;
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
	public Map<String, Object> getAllCatagory() {
		logger.info("getAllSubCatagory start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			
			List<Catagory> listOfSubCatagory = catagoryRepository.findAll();
			resp.put("listOfCatagory", listOfSubCatagory);
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("getAllCatagory end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
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

	@Override
	public Map<String, Object> getAllSubCatagory() {
		logger.info("getAllSubCatagory start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			
			List<SubCatagory> listOfSubCatagory = subCatagoryRepository.findAll();
			resp.put("listOfSubCatagory", listOfSubCatagory);
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("getAllSubCatagory end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getCatagoryById(int cid) {
		
		logger.info("getCatagoryById start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			
			List<SubCatagory> listOfSubCatagory = subCatagoryRepository.findBycId(cid);
			System.out.println(listOfSubCatagory+"List Of SubCataaory");
			resp.put("listOfSubCatagory", listOfSubCatagory);
			resp.putAll(GlobleAccessUtil.successResponse());
			logger.info("getCatagoryById end:::::::");
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getSubCatagoryByIdProduct(int saveCatagory) {

		logger.info("getSubCatagoryByIdProduct start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			Optional<SubCatagory> subCatagory = subCatagoryRepository.findById(saveCatagory);
			resp.put("subCatagory", subCatagory);
			resp.putAll(GlobleAccessUtil.successResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getCatagoryByIdProduct(int catagoryId) {
		
		logger.info("getCatagoryByIdProduct start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			Optional<Catagory> catagory = catagoryRepository.findById(catagoryId);
			resp.put("catagory", catagory);
			resp.putAll(GlobleAccessUtil.successResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getProductById(long pId) 
	{
		Map<String, Object> resp = new HashMap<String, Object>();
		try
		{
			Optional<Product> product = productRepository.findById(pId);
			resp.put("product",product);
			resp.putAll(GlobleAccessUtil.successResponse());
		}
		catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		return resp;
	}

	@Override
	public Map<String, Object> updateProduct(Product product) 
	{
		Map<String, Object> resp = new HashMap<String, Object>();
		try
		{
			Product products=null;
			Optional<Product> prod=productRepository.findById(product.getId());
			if(prod!=null)
			{
				products=productRepository.findById(product.getId()).get();
				if(product.getProductId()!=null && !product.getProductId().equals(""))
				{
					products.setProductId(product.getProductId());
				}
				if(product.getName()!=null && !product.getName().equals(""))
				{
					products.setName(product.getName());
				}
				if(product.getCatagory()!=null)
				{
					products.setCatagory(product.getCatagory());
				}
				if(product.getSubCatagory()!=null)
				{
					products.setSubCatagory(product.getSubCatagory());
				}
				
				if(product.getAsset()!=null && !product.getAsset().equals(""))
				{
					products.setAsset(product.getAsset());
				}
				if(product.getHsn()!=null && !product.getHsn().equals(""))
				{
					products.setHsn(product.getHsn());
				}
				if(product.getAddField1()!=null && !product.getAddField1().equals(""))
				{
					products.setAddField1(product.getAddField1());
				}
				if(product.getAddField2()!=null && !product.getAddField2().equals(""))
				{
					products.setAddField2(product.getAddField2());
				}
				Product product2= productRepository.save(products);
				resp.put("Data", product2);
		     	resp.put("StatusCode", "01");		   
		     	resp.put("StatusDesc", "UPDATED");
			}
			else
			{
				resp.put("StatusCode", "02");		   
		     	resp.put("StatusDesc", "NOT UPDATED");
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		return resp;
	}
	
	

	@Override
	public	Map<String, Object> getSubCatagoryByCId(int cid) {
		logger.info("getSubCatagoryByScId start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			
			List<SubCatagory> listofSubCatagory = subCatagoryRepository.findBycId(cid);
			resp.put("listofSubCatagory", listofSubCatagory);
			resp.putAll(GlobleAccessUtil.successResponse());
		
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getSubCatagoryByScId(int saveCatagory) {

		logger.info("getSubCatagoryByScId start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			Optional<SubCatagory> subCatagory = subCatagoryRepository.findById(saveCatagory);
			resp.put("subCatagory", subCatagory);
			//resp.putAll(GlobleAccessUtil.successResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

	@Override
	public Map<String, Object> getCatagoryByCid(int catagoryId) {
		
		logger.info("getCatagoryByCid start:::::::");
		Map<String, Object> resp = new HashMap<String, Object>();
		try {
			Optional<Catagory> catagory = catagoryRepository.findById(catagoryId);
			resp.put("catagory", catagory);
			//resp.putAll(GlobleAccessUtil.successResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.putAll(GlobleAccessUtil.failedResponse());
		}
		
		return resp;
	}

}
