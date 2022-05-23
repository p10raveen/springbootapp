package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;

@Controller
public class LoginController {

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String init(Model model)
	{
		model.addAttribute("msg", "Please Enter Login Details");
		return "login.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean)
	{
		if(loginBean !=null && loginBean.getUserName()!=null && loginBean.getPassword() != null)
		{
			if(loginBean.getUserName().equals("praveen")  && loginBean.getPassword().equals("12345"))
			{
				model.addAttribute("msg",loginBean.getUserName());
				return "success.jsp";
			}
			else
			{
				model.addAttribute("error","Invalid Details");
				return "login.jsp";
			}
		}
		else
		{
			model.addAttribute("error","Please Enter Details");
			return "login.jsp";
		}
	}
}
