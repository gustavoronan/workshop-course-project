package com.project.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.User;
import com.project.course.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> listaUsuario = userService.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User userObj = userService.findById(id);
		return ResponseEntity.ok().body(userObj);
	}
}
