package com.lk.codefest.day04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.codefest.day04.dto.cartListWithItems;
import com.lk.codefest.day04.entities.Cart;
import com.lk.codefest.day04.services.cartService;

@RestController
@RequestMapping(path = "/carts")
public class cartController {

	@Autowired
	cartService cartServ;
	
	@PostMapping(path = "/savecart")
	public Cart saveProducts(@RequestBody Cart cartObj) {
			
			return cartServ.saveProducts(cartObj);
			
		}
	
	
	
}
