package lorine.com.wildwebv2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import lorine.com.wildwebv2.Service.RegistrationService;
import lorine.com.wildwebv2.Model.Registration;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationservice;
	@GetMapping("/getRegistartionForm")
	public String Registration(Model model) {
		Registration registration =new Registration();
		model.addAttribute("registration",registration);
		return "registration";
}
	
	@PostMapping("/addNewUser")
	public String addNewUser(@ModelAttribute("registration") Registration registration) {
		registrationservice.addNewUser(registration);
		return "redirect:/";
	}
}