package com.test.coupa.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Configuration
@Component
public class WelcomeController {
	
	@Autowired
	Credentials c;

    @GetMapping("/welcome")
    public String welcomeForm(Model model) {
        model.addAttribute("welcome", new RequestData());
        return "welcome";
    }

    @PostMapping("/welcome")
    
    public String welcomeSubmit(@ModelAttribute("welcome") RequestData welcome) {
    	if (c.getUserName().equals(welcome.getUsername()) && c.getPassword().equals(welcome.getPassword()))
    	{
        return "result";
    	}
    	else
    	{
    		return "error";
    	}
    }
}
