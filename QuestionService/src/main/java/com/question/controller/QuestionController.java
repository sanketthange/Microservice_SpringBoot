package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionServiceImp;

@RestController
public class QuestionController {

	private QuestionServiceImp questionServiceImp;

	@Autowired
	public QuestionController(QuestionServiceImp questionServiceImp) {
		super();
		this.questionServiceImp = questionServiceImp;
	}
	
	@PutMapping("/question")
	public void save(@RequestBody Question question) {
		questionServiceImp.save(question);
	}
	
	@GetMapping("/question")
	public List<Question> findAll(){
		return questionServiceImp.getAll();
	}

	@GetMapping("/question/{questionId}")
	public Question findById(@PathVariable int questionId) {
		return questionServiceImp.getById(questionId);
	}
	
	@GetMapping("/question/quize/{quizeId}")
	public List<Question> getbyquizeId(@PathVariable int quizeId ){
		return questionServiceImp.getbyQuizeId(quizeId);
	}
}
