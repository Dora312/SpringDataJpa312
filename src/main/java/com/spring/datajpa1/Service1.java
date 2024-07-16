package com.spring.datajpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

	@Autowired
	Repository1 repo;
	
	public void add(Product product) {
		
	repo.save(product);
	}

}
