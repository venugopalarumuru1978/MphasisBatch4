package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="answer_info")
public class Answers {

	@Id
	@GeneratedValue
	private int ansid;
	
	private String answer;
	private String givenby;
	
	public int getAnsid() {
		return ansid;
	}
	
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getGivenby() {
		return givenby;
	}
	public void setGivenby(String givenby) {
		this.givenby = givenby;
	}
	
	
}
