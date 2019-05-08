package com.luv2code.springboot.myassessment.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.myassessment.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	String line = null;
	
	@Autowired
	EntityManager entityManager;
	
	// set up constructor injection
	@Autowired
	public CustomerDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public void saveCustomerData() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("persons.csv"));
			
			// skips first line of csv file.
			reader.readLine();
			
			Session currentSession = entityManager.unwrap(Session.class);
			
			readLines("persons.csv");
			
			while((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				
				Customer customer = new Customer();
				customer.setFirstName(data[0]);
				customer.setLastName(data[1]);
				customer.setEmail(data[2]);
				customer.setGender(data[3]);
				customer.setImage(data[4]);
		
				currentSession.save(customer);	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
	
	public void readLines(String file) {
        Scanner s = null;
        try {
            s = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        while (s.hasNextLine()) {
            String[] line = s.nextLine().split(",");
            for (String element : line) {
                if (!isBlank(element))
                    System.out.println(element);
            }

        }
	}	
}
