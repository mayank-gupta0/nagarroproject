package com.project1.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.entity.Pincode;
import com.project1.entity.ProductEntity;
import com.project1.entity.UserRegistration;
import com.project1.repository.PincodeRepository;
import com.project1.repository.ProductRepository;
import com.project1.repository.UserRepository;
import com.project1.response.AllProductList;
import com.project1.response.UserResponse;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	PincodeRepository pincodeRepository;

	public String register(UserResponse request) { // registring new user
		UserRegistration user = new UserRegistration();
		user.setUserFirstName(request.getFirstName());
		user.setUserLastName(request.getLastName());

		UserRegistration obj = new UserRegistration();
		obj = userRepository.findByEmail(request.getEmail()); // checking that email is already registered or not
		if (obj == null) {
			user.setEmail(request.getEmail());
			if (request.getPassword().equals(request.getConfirmPassword())) {
				user.setUserPassword(request.getPassword());
				userRepository.save(user);
				return "Registration Done Successfully";
			} else {
				return "Password is not Matched";

			}
		} else {
			return "Registration with this email already exist";
		}

	}

	public String login(String email, String password) { // function for user login
		// TODO Auto-generated method stub
		UserRegistration obj = new UserRegistration();
		obj = userRepository.findByEmail(email);
		if (obj == null) {
			return "Email is not registered Please Do Registration";
		} else {
			if (password.equals(obj.getUserPassword())) {
				return "Login Done Successfully";
			} else {
				return "Password is incorrect";
			}
		}
	}

	public List<ProductEntity> productinfo(String productname) { // getting product info search by name only
		// TODO Auto-generated method stub
		List<ProductEntity> obj = productRepository.findAll();
		List<ProductEntity> ar1 = new ArrayList<>(obj);

		String str = productname.toLowerCase(); // this is converting into lowercase

		List<ProductEntity> ar2 = new ArrayList<>();
		for (ProductEntity p : ar1) {
			String str1 = p.getProductName().toLowerCase();
			if (p.getProductName().equals(productname) || str1.equals(str)) {
				ar2.add(p);
			} else {
				continue;

			}
		}
		return ar2;

	}

	// getting all product list:

	public List<AllProductList> allproduct() {
		// TODO Auto-generated method stub
		List<ProductEntity> lst1 = productRepository.findAll(); // getting all data of product
		List<ProductEntity> lst2 = new ArrayList<>(lst1);

		List<AllProductList> ap1 = new ArrayList<>();
		AllProductList ap2;

		for (ProductEntity p : lst2) { // traversing all product entity items and adding to all product list class
			ap2 = new AllProductList();
			ap2.setProductName(p.getProductName());
			ap2.setProductDescription(p.getProductDescription());
			ap2.setProductBrand(p.getProductBrand());
			ap2.setProductCode(p.getProductcode());
			ap2.setProductPrice(p.getProductPrice());
			ap2.setProductLocation(p.getProductLocation());
			ap1.add(ap2);

		}
		return ap1;
	}

	public List<AllProductList> findBySimilarName(String name) {
		// TODO Auto-generated method stub
		List<ProductEntity> obj = productRepository.findByProductNameContaining(name);
		List<ProductEntity> obj1 = new ArrayList<>(obj);

		List<AllProductList> ap = new ArrayList<>(); //

		AllProductList ap2;
		for (ProductEntity p : obj1) {
			ap2 = new AllProductList();
			ap2.setProductName(p.getProductName());
			ap2.setProductDescription(p.getProductDescription());
			ap2.setProductBrand(p.getProductBrand());
			ap2.setProductCode(p.getProductcode());
			ap2.setProductPrice(p.getProductPrice());
			ap2.setProductLocation(p.getProductLocation());
			ap.add(ap2);

		}
		return ap; // ap have all data of similar products

	}

	public String checkingPincode(int productcode, int pinCode) {
		// TODO Auto-generated method stub
		List<Pincode> lst = pincodeRepository.findById(productcode);
		List<Pincode> ar = new ArrayList<>(lst);

		int random = (int) Math.floor((Math.random() * 10));
		String data = String.valueOf(random);
		String str = "";
		if (lst != null) {
			for (Pincode p : ar) {
				if (p.getCode1() == pinCode || p.getCode2() == pinCode || p.getCode3() == pinCode
						|| p.getCode4() == pinCode || p.getCode5() == pinCode) {
					str = "Your Product is Deliverable in " + data + " Days";
				} else {
					str = "Not Deliverable";
				}
			}

		} else {
			str = "Product id is wrong";

		}


		System.out.println("pincode data " + lst);
		return str;
	}
}
