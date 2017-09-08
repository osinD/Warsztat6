package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController extends SessionedController {
	@GetMapping("")
	public String home(Model m) {
		if(session().getAttribute("user")!=null) {
			m.addAttribute("msg","Zalogowano");
		}
		return "home";
	}
	

}
