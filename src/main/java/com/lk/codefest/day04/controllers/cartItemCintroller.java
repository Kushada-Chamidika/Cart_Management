package com.lk.codefest.day04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.entities.CartItem;
import com.lk.codefest.day04.services.cartItemService;

@RestController
@RequestMapping(path = "/cartitems")
public class cartItemCintroller {

	@Autowired
	cartItemService cartItemServ;
	
	@PostMapping(path = "/savecartitem")
	public CartItem saveCartItem(@RequestBody CartItem cartItemObj) {
	
			return cartItemServ.saveCartItem(cartItemObj);
			
		}
	
	@DeleteMapping(path = "deletecartitem/{id}")
	public String deleteCartItem(@PathVariable int id) {	 
			 return  cartItemServ.deleteCartItem(id);
		}
	
	@GetMapping(path = "/getcartwithitems")
	public List<cartListWithItems> getCartListWithItems() {
		
		return cartItemServ.getCartListWithItems();
		
	}
	
}
