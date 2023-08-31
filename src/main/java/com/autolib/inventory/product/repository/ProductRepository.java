package com.autolib.inventory.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autolib.inventory.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByProductId(long id);

}
