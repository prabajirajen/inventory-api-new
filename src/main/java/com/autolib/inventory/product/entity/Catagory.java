package com.autolib.inventory.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catagory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	
	private String cName;
	public Catagory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catagory(String cName) {
		super();
		this.cName = cName;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Catagory [cId=" + cId + ", cName=" + cName + ", getcId()=" + getcId() + ", getcName()=" + getcName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
