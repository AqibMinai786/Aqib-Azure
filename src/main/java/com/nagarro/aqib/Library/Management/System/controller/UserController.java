package com.nagarro.aqib.Library.Management.System.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.nagarro.aqib.Library.Management.System.entity.User;
import com.nagarro.aqib.Library.Management.System.repository.UserRepo;

@Controller
public class UserController {
	
	@Autowired(required=true)
	private UserRepo repo;
	
	//this method return login page
	@GetMapping("/")
	public String login(Model model) {
		User user=new User();
		model.addAttribute("user",user);
		return "login";   //this login is html page as we are using thymeleaf
	}
	
	
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user") User user) {
		String userId=user.getUserId();
		Optional<User> userdata=repo.findById(userId);
		if(user.getPassword().equals(userdata.get().getPassword())) {
			return "redirect:/books";
		}
		else {
			return "error";
		}
	}

}
