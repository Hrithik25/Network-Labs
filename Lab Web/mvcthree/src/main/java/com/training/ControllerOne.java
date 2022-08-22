package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerOne {
	@RequestMapping("/home")
	//read the provided form data
	public String home(@RequestParam("name") String name, @RequestParam("pass") String pass,Model m) {
		if(pass.equals("admin"))  
		{  
		    String msg="Hello "+ name;  
		    //add a message to the model  
		    m.addAttribute("message", msg);  
		    return "home";  
		}  
		else  
		{  
		    String msg="Sorry "+ name+". You entered an incorrect password";  
		    m.addAttribute("message", msg);  
		    return "errorpage";  
		}
	}
}

/*
@RequestMapping("/hello")  
  
public String display(@RequestParam("name") String name,
		@RequestParam("pass") String pass,Model m)

if(pass.equals("admin"))  
{  
    String msg="Hello "+ name;  
    //add a message to the model  
    m.addAttribute("message", msg);  
    return "viewpage";  
}  
else  
{  
    String msg="Sorry "+ name+". You entered an incorrect password";  
    m.addAttribute("message", msg);  
    return "errorpage";  
}
*/