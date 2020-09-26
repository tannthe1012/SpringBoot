package com.example.WebProject1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service 
public class TanService {
	private TanRepostitory repository;
	
	@Autowired
	public TanService (TanRepostitory repository) {
		this.repository = repository;
	}
	public String getService() {
		
		return repository.GetRepository();
	}
}