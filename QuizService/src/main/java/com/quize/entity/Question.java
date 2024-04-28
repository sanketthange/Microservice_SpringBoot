package com.quize.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int questionId;
	
	private String question;
	
	private int quizeId;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getQuizeId() {
		return quizeId;
	}

	public void setQuizeId(int quizeId) {
		this.quizeId = quizeId;
	}
}


