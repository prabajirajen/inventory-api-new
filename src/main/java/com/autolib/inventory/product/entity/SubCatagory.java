package com.autolib.inventory.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubCatagory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sCid;
	private String sCname;
	private int cId;

	public SubCatagory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCatagory(String sCname, int cId) {
		super();
		this.sCname = sCname;
		this.cId = cId;
	}

	public int getsCid() {
		return sCid;
	}

	public void setsCid(int sCid) {
		this.sCid = sCid;
	}

	public String getsCname() {
		return sCname;
	}

	public void setsCname(String sCname) {
		this.sCname = sCname;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

}
