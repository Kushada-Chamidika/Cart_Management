package com.lk.codefest.day04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.entities.CartItem;
import com.lk.codefest.day04.repository.cartItemRepository;

@Service
public class cartItemService {

	@Autowired
	cartItemRepository cartItemRepo;
	
public CartItem saveCartItem(CartItem cartItemObj) {
		
		return cartItemRepo.save(cartItemObj);
		
	}

public String deleteCartItem(int cartItemId) {
	
	 cartItemRepo.deleteById(cartItemId);
	return "Product Deleted->"+cartItemId;	
}

public List<cartListWithItems> getCartListWithItems() {
	return cartItemRepo.getcartListWithItems();
}

}
