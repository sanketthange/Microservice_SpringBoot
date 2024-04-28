package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionServiceImp implements QuestionService {

	private QuestionRepository questionRepository;
	
	@Autowired
	public QuestionServiceImp(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question getById(int id) {
		return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("question not found"));
	}

	@Override
	public void save(Question question) {
		questionRepository.save(question);
	}

	@Override
	public List<Question> getbyQuizeId(int id) {
		return questionRepository.getByQuizeId(id);
	}

}