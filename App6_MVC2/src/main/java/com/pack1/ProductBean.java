package com.pack1;

import java.io.Serializable;

public class ProductBean implements Serializable{
	
	private String ProductCode;
	private String ProductName;
	private String ProductCompany;
	private String ProductPrice;
	private String ProductQty;
	
	public ProductBean() {}
	
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCompany() {
		return ProductCompany;
	}
	public void setProductCompany(String productCompany) {
		ProductCompany = productCompany;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductQty() {
		return ProductQty;
	}
	public void setProductQty(String productQty) {
		ProductQty = productQty;
	}
	
	
	
}
