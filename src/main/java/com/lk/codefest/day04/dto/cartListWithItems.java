package com.lk.codefest.day04.dto;

public class cartListWithItems {
	
	int idCart;
	String productName;
	double qty;
	double productPrice;
	
	public cartListWithItems() {
	}
	
	

	public cartListWithItems(int idCart, String productName, double qty, double productPrice) {
		this.idCart = idCart;
		this.productName = productName;
		this.qty = qty;
		this.productPrice = productPrice;
	}



	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	

}
