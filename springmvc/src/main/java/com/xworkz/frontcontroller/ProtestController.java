package com.xworkz.frontcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProtestController {
	
	public ProtestController() {
		System.out.println("created\t"+this.getClass().getName());
	}
	@RequestMapping("/protest.do")
	public String onApply(HttpServletRequest req) {
		System.out.println("invoke onApply");
			String organization= req.getParameter("organization");
			System.out.println("Organization:"+organization);
			String reason= req.getParameter("reason");
			System.out.println("Reason:"+reason);
			String date= req.getParameter("date");
			System.out.println("Date:"+date);
			String location= req.getParameter("location");
			System.out.println("Location:"+location);
			req.setAttribute("reason",reason );
		return "/Protest.jsp";
	
	}
	}
	


