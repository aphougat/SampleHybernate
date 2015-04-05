package com.springapp.mvc;

import com.springapp.mvc.data.Product;
import com.springapp.mvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String getAllProduct(ModelMap model) {

		model.addAttribute("products",productService.getAllProducts());
		return "allProduct";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/edit")
	public String editProduct(@RequestParam (value = "id") int id, Model model)
	{
		Product product = productService.getById(id);

		model.addAttribute("product", product);

		return "editProduct";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public String editProduct(@ModelAttribute Product product, Model model)
	{
		productService.updateProduct(product);

		model.addAttribute("products", productService.getAllProducts());

		return "allProduct";
	}

}