package com.lk.codefest.day04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.entities.CartItem;

@Repository
public interface cartItemRepository extends JpaRepository<CartItem, Integer>{
	
	@Query("SELECT new com.lk.codefest.day04.dto.cartListWithItems(c.idCart,p.productName,ci.qty,p.productPrice) FROM cartitem ci JOIN ci.cart c JOIN ci.product p")
	public List<cartListWithItems> getcartListWithItems();
	
	
}
