package com.project.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.Order;
import com.project.course.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> listaUsuario = OrderService.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	@GetMapping("/order/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order OrderObj = OrderService.findById(id);
		return ResponseEntity.ok().body(OrderObj);
	}
}
