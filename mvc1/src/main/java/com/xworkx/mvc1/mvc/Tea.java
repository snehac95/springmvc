package com.xworkx.mvc1.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Tea {
	
	public Tea() {
		System.out.println("created\t"+this.getClass().getName());
	}
	@RequestMapping("/second.do")
	public String drinking(HttpServletRequest req) {
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
