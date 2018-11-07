package com.spring.mvc.demo;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cg.spring.mvc.demo.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	StudentService service;
	
	
	
	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}
	
	 /*@RequestMapping("GetIndexPage")
		public String getIndexPage(Model model){
			List<Student> list= service.getStudentList();
			System.out.println(list);
			for (Student student : list) {
				System.out.println(student);
				
			}
			model.addAttribute("studentList", list);
			return "index";
			
		}*/

	/*@RequestMapping("/displayDate")
	public String printDate(Model model)
	{
		System.out.println("in display date method. ..");
		LocalDate date = LocalDate.now();
	model.addAttribute("successMsg",date);
		
		return "Home";
	}
	
	@RequestMapping("showLoginPage")
	public String getLoginPage()
	{
		
		
		return "login";
	}
	
	
	@RequestMapping("loginAction")
	public String validateUser(Model model, @RequestParam("username")String uname,@RequestParam("password")String pass)
	{ 
		if(uname.equals("tejas") && pass.equals("tejas"))
		{
			LocalDate date = LocalDate.now();
			model.addAttribute("successMsg", date);
			return "Home";
			
		}
		else {
			
			model.addAttribute("errorMsg", "Invalid username/password");
			return "error";
		}
	
	}
*/	
	@RequestMapping("registeruser")
	public String getRegistrationPage(Model model) 
	
	{
		Student student = new Student();
		model.addAttribute("studentBean", student);
		return "registration";
		
		
	}
	

	 @RequestMapping("register")
	 public String registerUser(   Model model,  @ModelAttribute("studentBean") @Valid Student student, BindingResult result )
	 {
		 

			
			if(result.hasErrors()){
				return "registration";
			}
			
			else{
				
				student = service.addstudent(student);
				
				model.addAttribute("student", student);
				 
				model.addAttribute("successMsg","Student added ");
	    		
				return "Success";
			}
	  }
	 
	 

	
		
	 
	 
	 
	 
	 
	 
}

