package com.autolib.inventory.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	
	@Column( name="p_code",nullable = false)
	private String productCode;
	
	@Column( name="name",nullable = false)
	private String productName;
	
	@Column( name="catagory")
	private String catagory;
	
	@Column( name="sub_catagory")
	private String subCatagory;
	
	@Column( name="asset")
	private String asset;
	
	@Column( name="hsn")
	private String hsn;
	
	@Column( name="add_field1")
	private String addField1;
	
	@Column( name="add_field2")
	private String addField2;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getSubCatagory() {
		return subCatagory;
	}

	public void setSubCatagory(String subCatagory) {
		this.subCatagory = subCatagory;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getHsn() {
		return hsn;
	}

	public void setHsn(String hsn) {
		this.hsn = hsn;
	}

	public String getAddField1() {
		return addField1;
	}

	public void setAddField1(String addField1) {
		this.addField1 = addField1;
	}

	public String getAddField2() {
		return addField2;
	}

	public void setAddField2(String addField2) {
		this.addField2 = addField2;
	}
	
	
	

}
