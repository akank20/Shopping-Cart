package com.hcl.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.shop.service.CartService;

@Controller
public class CartController{
	
	private CartService cartService;
	
	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;
	}


	@RequestMapping({"/showCart","/",""})
	public String showCart(Model model) {
		
		model.addAttribute("msg", "Data Saved!");
		return "cart";
	}
	
	
}
