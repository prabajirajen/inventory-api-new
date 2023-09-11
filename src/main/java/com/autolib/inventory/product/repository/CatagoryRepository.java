package com.autolib.inventory.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autolib.inventory.product.entity.Catagory;


public interface CatagoryRepository extends JpaRepository<Catagory, Integer>
{

}
