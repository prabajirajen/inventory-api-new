package com.autolib.inventory.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autolib.inventory.product.entity.SubCatagory;

@Repository
public interface SubCatagoryRepository extends JpaRepository<SubCatagory, Integer>
{

	List<SubCatagory> findBycId(int cid);

}
