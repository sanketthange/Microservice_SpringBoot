package com.quize.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quize.entity.Quize;
import com.quize.repository.QuizeRepository;

@Service
public class QuizeServiceImp implements QuizeService {

	private QuizeRepository quizeRepository;
	
	private QuestionClient questionClient;
	
	@Autowired
	public QuizeServiceImp(QuizeRepository quizeRepository, QuestionClient questionClient) {
		super();
		this.quizeRepository = quizeRepository;
		this.questionClient = questionClient;
	}

	@Override
	public void add(Quize quize) {
		
       quizeRepository.save(quize);
	}

	@Override
	public List<Quize> findAll() {
		
		List<Quize> quize= quizeRepository.findAll();
		
		List<Quize> newque = quize.stream().map(que ->{
			que.setQuestion(questionClient.getquestionByQuize(que.getId()));
			return que;
		}).collect(Collectors.toList());
		
		return newque;
	}

	@Override
	public Quize findById(int id) {
		Quize quize= quizeRepository.findById(id).orElseThrow(()-> new RuntimeException("quize not found"));
		
		 quize.setQuestion(questionClient.getquestionByQuize(quize.getId())); 
		
		return quize;
		
	}

}
