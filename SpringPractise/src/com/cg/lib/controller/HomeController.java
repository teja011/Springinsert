package com.cg.lib.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.lib.bean.Book;
import com.cg.lib.service.IBookService;

@Controller
public class HomeController {
	
	@Autowired
	IBookService ibs;
	
	public IBookService getIbs() {
		return ibs;
	}

	public void setIbs(IBookService ibs) {
		this.ibs = ibs;
	}

	@RequestMapping("Login")
	public String getLoginPage() { 
		return "LoginPage";
	}
	
	@RequestMapping("loginaction")
	public String validateUser(Model model,@RequestParam("username") String username,
			@RequestParam("password") String password)
{	
		if(username.equals("tejas") && password.equals("tejas"))
		{
		model.addAttribute("successMsg",
				"Welcome to Home Page");
		model.addAttribute("username", username);
		//System.out.println("in display date method. ..");
		LocalDate date = LocalDate.now();
		model.addAttribute("successMsg",date);
		
		return "Home";
		}
		else
		{
			model.addAttribute
			("errorMsg", "Invalid Username/Password");
			return "Error";
		}
	}
@RequestMapping("insertbook")
public String insertBookInfo(Model model) {
	Book book = new Book();
	model.addAttribute("bookBean",book);
	return "addbook";
}
	@RequestMapping("viewbook")
	public String registerbook(Model model,@ModelAttribute("bookBean") @Valid Book book,
			BindingResult result)
	{
		
		book = ibs.addBook(book);
		model.addAttribute("book", book);
		model.addAttribute("successMsg","book added");
		return  "Success";
	}
		}
	

	
	

