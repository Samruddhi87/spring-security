package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000" , exposedHeaders = "Access-Control-Allow-Origin")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	@PostMapping("/post")
	public Customer getCustomer(@RequestBody Customer cust)
	{
		Customer c= customerRepository.save(cust);
		return c;
	}
	
	@GetMapping("/get")
	public List<Customer> getCust(){
		return customerRepository.findAll();
	}
	
}
