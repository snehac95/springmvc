package com.xworkx.mvc1.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping
public class Country {
	public Country() {
		System.out.println("created\t"+this.getClass().getName());
	}
	@RequestMapping("/country.do")
	public String facility(HttpServletRequest req) {
		System.out.println("invoke facility");
			String c_name= req.getParameter("c_name");
			System.out.println("Name:"+c_name);
			String c_noOfStates= req.getParameter("c_noOfStates");
			System.out.println("NoOfStates:"+c_noOfStates);
			String c_population= req.getParameter("c_population");
			System.out.println("Population:"+c_population);
			String c_religion= req.getParameter("c_religion");
			System.out.println("Religion:"+c_religion);
			req.setAttribute("population",c_population);
		return "/Country.jsp";
	
	}
	}
	



	


