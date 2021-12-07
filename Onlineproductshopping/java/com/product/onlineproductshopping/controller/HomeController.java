package com.product.onlineproductshopping.controller;

import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product.onlineproductshopping.entity.CheckoutData;
import com.product.onlineproductshopping.entity.ContactData;
import com.product.onlineproductshopping.entity.LoginData;
import com.product.onlineproductshopping.entity.UserData;
import com.product.onlineproductshopping.repository.CheckRepository;
import com.product.onlineproductshopping.repository.ContactRepository;
import com.product.onlineproductshopping.repository.UserRepository;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;

	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	
	@GetMapping("/electronic")
	public String electronic()
	{
		return "electronic";
	}
	
	@GetMapping("/clothing")
	public String clothing()
	{
		return "clothing";
	}
	
	@GetMapping("/furniture")
	public String furniture()
	{
		return "furniture";
	}
	
	@GetMapping("/beautyproducts")
	public String beautyproducts()
	{
		return "beautyproducts";
	}
	
	
	

	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute LoginData u, HttpSession session)
	{
		System.out.println(u);
		
		
		return "redirect:/home";
	}
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData u, HttpSession session)
	{
		con.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/home";
	}
	
	
	@PostMapping("/about")
	public String about(@ModelAttribute ContactData u, HttpSession session)
	{
		con.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/home";
	}
		
	
}
