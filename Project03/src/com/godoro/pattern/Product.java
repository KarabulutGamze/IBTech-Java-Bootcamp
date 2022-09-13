package com.godoro.pattern;

public class Product {

	public double productId;
	public double salesPrice;
	public String productName;
	
	
	public Product(double productId,  String productName, double salesPrice) {
	
		this.productId = productId;
		this.salesPrice = salesPrice;
		this.productName = productName;
	}
	
	
	public Product() {
	
	}


	public double getProductId() {
		return productId;
	}
	public void setProductId(double productId) {
		this.productId = productId;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	
}
