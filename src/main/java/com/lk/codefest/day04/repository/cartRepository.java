package com.lk.codefest.day04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lk.codefest.day04.dto.UserNameListObj;
import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.dto.productListIdNamePrice;
import com.lk.codefest.day04.entities.Cart;

@Repository
public interface cartRepository extends JpaRepository<Cart, Integer> {
	

}
