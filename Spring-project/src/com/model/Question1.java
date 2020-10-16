package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Question1 {

	@Id
	
	private String id;
	private String question;
	
	@OneToOne(mappedBy="question")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Answer1 Answer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer1 getAnswer() {
		return Answer;
	}

	public void setAnswer(Answer1 answer) {
		Answer = answer;
	}
	
}
