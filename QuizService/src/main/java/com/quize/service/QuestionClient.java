package com.quize.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quize.entity.Question;

//@FeignClient(url = "http://localhost:8082",value = "Question-client")
@FeignClient(name = "QUESTIONSERVICE")
public interface QuestionClient {
	
	
	@GetMapping("/question/quize/{quizeId}")
	List<Question> getquestionByQuize(@PathVariable int quizeId);
		
	

}
