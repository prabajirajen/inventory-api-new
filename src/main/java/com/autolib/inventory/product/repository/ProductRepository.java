package com.autolib.inventory.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autolib.inventory.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

<<<<<<< Updated upstream
=======
		Product	findByProductId(String productId);

	 
>>>>>>> Stashed changes
}
