package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Answer1 {

	@Id
	private String id;
	private String answer;
	private String answerBY;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Question1 question;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerBY() {
		return answerBY;
	}
	public void setAnswerBY(String answerBY) {
		this.answerBY = answerBY;
	}
	
}
