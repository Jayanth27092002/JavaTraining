package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {
    	model.addAttribute("user",new User());
    	return "home";
    }
    
    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // This will render users.jsp
    }
    
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("user") User user) {
    	userService.createUser(user);
    	return "details";
    }
    
    
    
}