package com.luv2code.springboot.myassessment.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.myassessment.dao.CustomerDAO;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	// getting method from DAO with autowiring
	public void saveCustomerData(String file) throws IOException {
		customerDAO.saveCustomerData();
	}

}
