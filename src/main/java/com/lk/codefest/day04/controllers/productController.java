package com.lk.codefest.day04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.codefest.day04.dto.productListIdNamePrice;
import com.lk.codefest.day04.entities.Product;
import com.lk.codefest.day04.services.productService;


@RestController
@RequestMapping(path = "/products")
public class productController {

	
	@Autowired
	productService productServ;

	@PostMapping(path = "/saveproduct")
public Product saveProducts(@RequestBody Product proObj) {
		
		return productServ.saveProducts(proObj);
		
	}
	
	@DeleteMapping(path = "/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id) {	 
			 return  productServ.deleteProduct(id);	
		}

	@PutMapping(path = "/updateProduct")
	public Product updateProduct(@RequestBody Product proObj) {	 
			 return  productServ.updateProducts(proObj);
		}
	
	@GetMapping(path = "/getproductswithidnameprice")
	public List<productListIdNamePrice> getProductsWithIdNamePrice() {
		return productServ.getProductsWithIdNamePrice();
	}

	
}
