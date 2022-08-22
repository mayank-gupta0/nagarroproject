package com.project1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.entity.Pincode;

@Repository
public interface PincodeRepository extends JpaRepository<Pincode, Integer> {

//	@Query(value = "select * from pincode p where p.prod_id =?1", nativeQuery = true)
	@Query(value = "select * from pincode p where p.productcode =?1", nativeQuery = true)
	List<Pincode> findById(int productcode);

}
