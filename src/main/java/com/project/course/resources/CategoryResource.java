package com.project.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.Category;
import com.project.course.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
	@Autowired
	private CategoryService CategoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> listaUsuario = CategoryService.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category CategoryObj = CategoryService.findById(id);
		return ResponseEntity.ok().body(CategoryObj);
	}
}
