package com.project1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.response.ProductResponse;
import com.project1.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/addproduct")     // adding new product but only it can be access by admin
	public String addNewProduct(@Valid @RequestBody ProductResponse response, @RequestParam String username,
			@RequestParam String password) {
		if (username.equals("admin") && password.equals("root")) {
			return productService.addProduct(response);

		} else {
			return "You are not admin";

		}

	}

}
