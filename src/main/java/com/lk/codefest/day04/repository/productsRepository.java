package com.lk.codefest.day04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lk.codefest.day04.dto.productListIdNamePrice;
import com.lk.codefest.day04.entities.Product;

@Repository
public interface productsRepository extends JpaRepository<Product, Integer>{
	
	@Query("SELECT new com.lk.codefest.day04.dto.productListIdNamePrice(p.idProduct,p.productName,p.productPrice) FROM products p")
	public List<productListIdNamePrice> getProductsWithIdNamePrice();

}
