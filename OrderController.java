package com.tnsif.Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.Shopping.entity.Order;
import com.tnsif.Shopping.repository.OrderRepository;

@RestController
public class OrderController {

		@Autowired
		OrderRepository repo;

		@PostMapping("/Order")
		public Order addEmployee(@RequestBody Order e) {
			return repo.save(e);

		}

		@GetMapping("/Order")
		public List<Order> getEmployees()

		{

			return repo.findAll();
		}

		@GetMapping("/Order/{id}")
		public Order getOwnerById(Integer id) {
			return repo.findById(id).get();

		}

	}

