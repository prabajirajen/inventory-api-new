package com.autolib.inventory.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "p_id")
	private String productId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "catagory_id")
	private int catagoryId;
	
	@Column(name = "sub_catagory_id")
	private int subCatagoryId;
	
	@Column(name = "asset")
	private String asset;
	
	@Column(name = "hsn")
	private String hsn;
	
	@Column(name = "add_field1")
	private String addField1;
	
	@Column(name = "add_filed2")
	private String addField2;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}

	public int getSubCatagoryId() {
		return subCatagoryId;
	}

	public void setSubCatagoryId(int subCatagoryId) {
		this.subCatagoryId = subCatagoryId;
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

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", name=" + name + ", catagoryId=" + catagoryId
				+ ", subCatagoryId=" + subCatagoryId + ", asset=" + asset + ", hsn=" + hsn + ", addField1=" + addField1
				+ ", addField2=" + addField2 + "]";
	}

	public String getAddField2() {
		return addField2;
	}

	public void setAddField2(String addField2) {
		this.addField2 = addField2;
	}

	
}
