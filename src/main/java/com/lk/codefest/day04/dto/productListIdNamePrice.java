package com.lk.codefest.day04.dto;

public class productListIdNamePrice {
	
	int idProduct;
	String productName;
	double productPrice;
	
	public productListIdNamePrice() {
	}

	public productListIdNamePrice(int idProduct, String productName, double productPrice) {
		this.idProduct = idProduct;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
