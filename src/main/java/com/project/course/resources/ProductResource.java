package com.project.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.Product;
import com.project.course.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	@Autowired
	private ProductService ProductService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> listaUsuario = ProductService.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product ProductObj = ProductService.findById(id);
		return ResponseEntity.ok().body(ProductObj);
	}
}
