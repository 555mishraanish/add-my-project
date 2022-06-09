package com.sun.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
//@RequestMapping("/entry/*")
public class FormController {

//	@RequestMapping("handle1")
//	public String helloController() {
//		System.out.println("helloController");
//		return "hello from controoler";
//	}
//	
//	@RequestMapping("handle2")
//	public String hiController() {
//		System.out.println("hiController");
//		return "hello from controoler";
//	}
	
	
//	@RequestMapping("/entry/handle1")
//	public String helloController() {
//		System.out.println("helloController");
//		return "hello.jsp";
//	}
//	
//	@RequestMapping("/entry/handle2")
//	public String hiController() {
//		System.out.println("hiController");
//		return "hi.jsp";
//	}
	
	
	@RequestMapping("/entry/handle1")
	public ModelAndView helloController() {
		System.out.println("helloController");
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("key1", "HelloController data");
		mv.setViewName("hello");
		
		return mv;
	}
	
	@RequestMapping("/entry/handle2")
	public ModelAndView hiController() {
		System.out.println("hiController");
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("key2", "HiController data");
		mv.setViewName("hi");
		
		return mv;
	}
	
}





