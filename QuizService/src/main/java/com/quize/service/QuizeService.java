package com.quize.service;

import java.util.List;

import com.quize.entity.Quize;

public interface QuizeService {

	void add(Quize quize );
	
	List<Quize> findAll();
	
	Quize findById(int id); 
	
}
