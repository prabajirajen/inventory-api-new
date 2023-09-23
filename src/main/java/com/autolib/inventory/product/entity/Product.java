package com.autolib.inventory.product.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product")
public class Product {
	
	
<<<<<<< Updated upstream
=======
	public Product() {
	
	}
	

	public Product(long id, String productId, String name, String asset, String hsn, String addField1, String addField2,
			Catagory catagory, SubCatagory subCatagory) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.asset = asset;
		this.hsn = hsn;
		this.addField1 = addField1;
		this.addField2 = addField2;
		this.catagory = catagory;
		this.subCatagory = subCatagory;
	}




>>>>>>> Stashed changes
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
<<<<<<< Updated upstream
=======

	@Column(name = "asset")
	private String asset;
	
	@Column(name = "hsn")
	private String hsn;
	
	@Column(name = "add_field")
	private String addField1;
	
	@Column(name = "add_filed_new")
	private String addField2;
	
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "catagory_id", referencedColumnName = "cId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Catagory catagory;
	
	
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "sub_catagory_id", referencedColumnName = "sCid")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private SubCatagory subCatagory;
	
	
	
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
	


<<<<<<< Updated upstream
=======
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


	public String getAddField2() {
		return addField2;
	}

	public void setAddField2(String addField2) {
		this.addField2 = addField2;
	}

	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	
	
	

	public SubCatagory getSubCatagory() {
		return subCatagory;
	}


	public void setSubCatagory(SubCatagory subCatagory) {
		this.subCatagory = subCatagory;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", name=" + name + ", asset=" + asset + ", hsn=" + hsn
				+ ", addField1=" + addField1 + ", addField2=" + addField2 + ", catagory=" + catagory + ", subCatagory="
				+ subCatagory + "]";
	}


	
	
	
	
>>>>>>> Stashed changes
}
