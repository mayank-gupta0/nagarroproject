package com.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project1.entity.ProductEntity;
import com.project1.repository.ProductRepository;
import com.project1.response.ProductResponse;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;


//	@Autowired 
//	ProductEntity productEntity;

	public String addProduct(ProductResponse response) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = new ProductEntity(); // creating object of product entity class

		String str1 = Long.toString(response.getProductPrice());
		String str2 = String.valueOf(response.getProductCode());
		// setting all values and getting all data in response object
		if (response.getProductName().equals("") || response.getProductLocation().equals("")
				|| response.getProductBrand().equals("") || str1.equals("") || str2.equals("")) {
			return "Sorry, You can't leave this field blank";

		} else {
			productEntity.setProductName(response.getProductName());
			productEntity.setProductDescription(response.getProductDescription());
			productEntity.setProductBrand(response.getProductBrand());
			productEntity.setProductLocation(response.getProductLocation());
			productEntity.setProductPrice(response.getProductPrice());
			ProductEntity obj = productRepository.findByProductcode(response.getProductCode());
			if (obj == null) {
				productEntity.setProductcode(response.getProductCode());
				productRepository.save(productEntity);

				return "Product Information saved";
			} else {
				return "Product Code is Already Exist";
			}

		}
	}

}
