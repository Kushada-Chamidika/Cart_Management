package com.lk.codefest.day04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.entities.Cart;
import com.lk.codefest.day04.repository.cartRepository;

@Service
public class cartService {
	
	@Autowired
	cartRepository cartRepo;
	
public Cart saveProducts(Cart cartObj) {
		
		return cartRepo.save(cartObj);
		
	}

}
