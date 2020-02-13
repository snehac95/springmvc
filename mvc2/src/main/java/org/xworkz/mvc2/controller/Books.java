package org.xworkz.mvc2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Books {
	public Books() {
		System.out.println("created\t"+this.getClass().getName());
	}
	@RequestMapping("third.do")
	public String writting(HttpServletRequest req) {
		System.out.println("invoked writting");
		System.out.println("invoked drinking");
		String message= req.getParameter("message");
		System.out.println("Message:"+message);
		String email= req.getParameter("email");
		System.out.println("Email:"+email);
		
		String file= req.getParameter("file");
		System.out.println("File Details:"+file);
		return "/index.jsp";
		
		
	}
	

}
