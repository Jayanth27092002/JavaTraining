package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("user",new UserModel());
		return "index";
	}
	
	@PostMapping("/processForm")
    public String processForm(@ModelAttribute("user") UserModel user) {
        
        return "userDetails"; 
    }

}
