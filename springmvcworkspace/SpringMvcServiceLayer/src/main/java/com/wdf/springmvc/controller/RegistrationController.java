package com.wdf.springmvc.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.wdf.springmvc.model.Login;
import com.wdf.springmvc.model.Product;
import com.wdf.springmvc.model.UserResponse;

@Controller
public class RegistrationController {

	RestTemplate template = new RestTemplate();

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("UserResponse", new UserResponse());
		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public String registerprocess(@ModelAttribute UserResponse obj, Model model) {
		String url = "http://localhost:8090/api/user/register";
		String rg = template.postForObject(url, obj, String.class);
		model.addAttribute("str", rg);
		return "registerProcess";
	}

	@RequestMapping("/login")
	public String login(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "login";

	}

	@RequestMapping(value = "/loginProcess")
	public String loginProcess(@ModelAttribute Login obj, Model model) {
		String email = obj.getEmail();
		String password = obj.getPassword();
		String user = template.getForObject(
				"http://localhost:8090/api/user/login?email=" + email + "&password=" + password, String.class);

		model.addAttribute("str", user);
		return "loginProcess";

	}

	@RequestMapping(value = "/viewAllProducts")
	public String ViewAllProducts(Model model) {
		String url = "http://localhost:8090/api/user/allproduct";
		List<Product> lst = template.getForObject(url, List.class);
		model.addAttribute("data", lst);

		return "viewAllProducts";

	}

	@RequestMapping(value = "/viewSimilarProducts", method = RequestMethod.GET)
	public String ViewSimilarProducts(@RequestParam("value") String productName, Model model) {
		List<Product> lst = template.getForObject("http://localhost:8090/api/user/similarname?name=" + productName,
				List.class);
		model.addAttribute("data", lst);
		return "searchByName";

	}

	@RequestMapping("/checkingdelivery")
	public String checking() {
		return "checkingdelivery";

	}

	@RequestMapping("/checked")
	public String checked(@RequestParam String productcode, @RequestParam String pincode, Model model) {
		String s = template.getForObject(
				"http://localhost:8090/api/user/pincode?productcode=" + productcode + "&pinCode=" + pincode,
				String.class);
		model.addAttribute("data", s);

		return "checked";

	}

	@RequestMapping("/homepage")
	public String homePageSection(@RequestParam("value") String productName, Model model) {
		List<Product> lst = template.getForObject("http://localhost:8090/api/user/similarname?name=" + productName,
				List.class);
		model.addAttribute("data", lst);
		return "homepagedata";

	}
}
