package com.productdetails.productmanager.web;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.productdetails.productmanager.model.ProductDetails;
import com.productdetails.productmanager.service.ProductDetailsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProductDetailsController {
	
	@Autowired
    private ProductDetailsService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("users", userService.getAllUsers() );
		
		return "home";
	}
	
		@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String home1(Model model) {
		
		model.addAttribute("users", userService.getAllUsers() );
		
		return "home1";
	}
	
		@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String home2(Model model) {
		
		model.addAttribute("users", userService.getAllUsers() );
		
		return "home2";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser() {
		
		userService.save(new ProductDetails("ProductDetails_" + new Random().nextInt(1000)));
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/add1", method = RequestMethod.GET)
	public String addUser1() {
		
		userService.save(new ProductDetails("ProductDetails_" + new Random().nextInt(1000),  new Random().nextInt(1000)+""));
		
		return "redirect:/home1";
	}
	
	@RequestMapping(value = "/add2", method = RequestMethod.GET)
	public String addUser2() {
		
		userService.save(new ProductDetails("ProductDetails_" + new Random().nextInt(1000),  new Random().nextInt(1000)+""));
		
		return "redirect:/home2";
	}
	
	@RequestMapping(value = "/delete/{userId}", method = RequestMethod.GET)
	public String removeUser(@PathVariable("userId") int userId) {
		
		userService.delete(userId);
		
		return "redirect:/";
	}
	
}
