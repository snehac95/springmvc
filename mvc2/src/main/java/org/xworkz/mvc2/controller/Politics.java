package org.xworkz.mvc2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")

public class Politics {
	public Politics() {
		System.out.println("created\t"+this.getClass().getName());
	}
	@RequestMapping("/politics.do")
	public String management(HttpServletRequest req) {
		System.out.println("invoke management");
			String p_symbol= req.getParameter("p_symbol");
			System.out.println("symbol:"+p_symbol);
			String p_noOfCandidates= req.getParameter("p_noOfCandidates");
			System.out.println("noOfCandidates:"+p_noOfCandidates);
			String p_name= req.getParameter("p_name");
			System.out.println("name:"+p_name);
			
			req.setAttribute("sneha",p_symbol);
		return "/Politics.jsp";
	
	}
	}
	



	




