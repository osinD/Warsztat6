package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entity.LoginData;
import pl.coderslab.entity.User;
import pl.codeslab.repository.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginController extends SessionedController{

	@Autowired
	UserRepository repoUser;
	
	
	
	@GetMapping("")
	public String register(Model m) {
		LoginData login = new LoginData();
		m.addAttribute("login", login);
		return "login";
	}
	
	@PostMapping("")
	public String postLogin(LoginData user , Model m) {
		
		User u  = this.repoUser.findByEmail(user.getEmail());
		if(u==null) {
		m.addAttribute("msg", "Enater valid data");
		}
		if(u.isPasswordCorrect(user.getPassword())) {
			session().setAttribute("user", u);
		}
		return "redirect:/home";
	}
}
