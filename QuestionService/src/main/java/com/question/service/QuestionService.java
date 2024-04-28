package com.question.service;

import java.util.List;

import com.question.entity.Question;

public interface QuestionService {
	
	List<Question> getAll();
	
	Question getById(int id );
	
	void save(Question question);
	
	List<Question> getbyQuizeId(int id);
	
}