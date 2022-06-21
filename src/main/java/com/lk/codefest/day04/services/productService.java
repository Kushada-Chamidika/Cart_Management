package com.lk.codefest.day04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.codefest.day04.dto.productListIdNamePrice;
import com.lk.codefest.day04.entities.Product;
import com.lk.codefest.day04.repository.productsRepository;

@Service
public class productService {
	
	@Autowired
	productsRepository productsRepo;
	
	public Product saveProducts(Product proObj) {
		
		return productsRepo.save(proObj);
		
	}
	
public String deleteProduct(int productId) {
		
		productsRepo.deleteById(productId);
			return "Product Deleted->"+productId;	
	}

public Product updateProducts(Product proObj) {
	
	Product avProduct = productsRepo.findById(proObj.getIdProduct()).orElse(null);
	
	if(avProduct!=null) {
		
		avProduct.setProductName(proObj.getProductName());
		avProduct.setProductDescription(proObj.getProductDescription());
		avProduct.setProductPrice(proObj.getProductPrice());
		
		productsRepo.save(avProduct);
		
	}
	return avProduct;
	
}

public List<productListIdNamePrice> getProductsWithIdNamePrice() {
	return productsRepo.getProductsWithIdNamePrice();
}
		
	}


