package com.productmanagement.controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.productmanagement.model.Product;
import com.productmanagement.service.ProductService;

@Controller
public class HomeController {
@Autowired
private ProductService service;
@GetMapping("/homePage")
	public String homePage(Model model)
	{
	List<Product> list=service.listAll();
	model.addAttribute("list",list);
	return "index";	
}
@RequestMapping("/addProduct")
public String addProduct(Model model)
{
	Product product =new Product();
	model.addAttribute("product",product);
	return "newproduct";
	}
@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveProduct(@ModelAttribute("product") Product product) {
    service.save(product);
     
    return "redirect:/";
}
}
