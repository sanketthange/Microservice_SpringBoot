package com.quize.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quize.entity.Quize;
import com.quize.service.QuestionClient;
import com.quize.service.QuizeServiceImp;

@RestController
public class QuizeController {
	
	private QuizeServiceImp quizeServiceImp;
	
	
	
	@Autowired
	public QuizeController(QuizeServiceImp quizeServiceImp) {
		this.quizeServiceImp = quizeServiceImp;
	}

	@PutMapping("/quize")
	public void save(@RequestBody Quize quize) {
		quizeServiceImp.add(quize);
		
	}
	
	@GetMapping("/quize")
	public List<Quize> findAll(){
	
		return quizeServiceImp.findAll();
	}
	
	@GetMapping("/quize/{quizeid}")
	public Quize find(@PathVariable int quizeid) {
		
		return quizeServiceImp.findById(quizeid);
	}
	
}
