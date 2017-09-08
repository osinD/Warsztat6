package pl.coderslab.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entity.LoginData;
import pl.coderslab.entity.User;
import pl.codeslab.repository.UserRepository;

@Controller
@RequestMapping("/register")
public class RegisterController {

	
	@Autowired
	UserRepository repoUser;
	
	@GetMapping("")
	public String register(Model m) {
		User user = new User();
		user.setEnable(false);
		m.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping("")
	public String registerPost(@Valid User user , BindingResult result) {
		if(result.hasErrors()) {
		return "huj";
		}
		repoUser.save(user);
		return "redirect:/home";
	}
	
	
	
	
}
