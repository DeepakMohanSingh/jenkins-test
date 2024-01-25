package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

	@Autowired
	private final StoreRepository repo;

	public StoreService(StoreRepository repo) {
		this.repo = repo;
	}

	public List<Store> getAllContents() {
		return repo.findAll();
	}
}
