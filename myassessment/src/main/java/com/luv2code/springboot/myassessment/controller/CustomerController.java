package com.luv2code.springboot.myassessment.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.myassessment.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	private String file;
	
	@RequestMapping("/")
	public String setDataInDB() throws IOException {
		 customerService.saveCustomerData(file);
		 
		 // HTML to view result.
		 return "testing";
	}
}
