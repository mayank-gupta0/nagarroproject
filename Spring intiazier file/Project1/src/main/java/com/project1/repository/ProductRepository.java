package com.project1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

	public ProductEntity findByProductcode(int productcode);

	public List<ProductEntity> findByProductName(String product_name);

	public List<ProductEntity> findByProductNameContaining(String name);

}
