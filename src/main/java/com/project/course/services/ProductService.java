package com.project.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.course.entities.Product;
import com.project.course.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findAll(){
		
		return ProductRepository.findAll();	
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = ProductRepository.findById(id);
		return obj.get();
	}
}

