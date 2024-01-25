package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	private final StoreService service;

	public StoreController(StoreService service) {
		this.service = service;
	}

	@GetMapping("/contents")
	public List<Store> getAllContents() {
		return service.getAllContents();
	}
}
