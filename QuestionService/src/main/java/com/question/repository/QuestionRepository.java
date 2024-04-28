package com.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	
	List<Question> getByQuizeId(int id);
}
