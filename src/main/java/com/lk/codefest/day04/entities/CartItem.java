package com.lk.codefest.day04.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "cartitem")
@Table(name = "cartitem")
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idCartItem;
	double qty;
	
	@ManyToOne(cascade = CascadeType.MERGE ,fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cart")
	Cart cart;
	
	@ManyToOne(cascade = CascadeType.MERGE ,fetch = FetchType.EAGER)
	@JoinColumn(name = "id_product")
	Product product;

	public int getIdCartItem() {
		return idCartItem;
	}

	public void setIdCartItem(int idCartItem) {
		this.idCartItem = idCartItem;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
