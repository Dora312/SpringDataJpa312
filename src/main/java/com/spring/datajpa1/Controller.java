package com.spring.datajpa1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Controller {

	@Autowired
	Service1 service;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Product product)
	{
		service.add(product);
		return "added_sucess";
	}
}
