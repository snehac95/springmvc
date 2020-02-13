package com.xworkz.frontcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Controller {
	public Controller() {
		System.out.println("created\t" + this.getClass().getName());
	}

	@RequestMapping("/first.do")
	public String onStart(HttpServletRequest req) {
		System.out.println("Invoke onstart");
		String message= req.getParameter("message");
		System.out.println("Message:"+message);
		String email= req.getParameter("email");
		System.out.println("Email:"+email);
		
		String file= req.getParameter("file");
		System.out.println("File Details:"+file);
		return "/index.jsp";
	

	}
}
