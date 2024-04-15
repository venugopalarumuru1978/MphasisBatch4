package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Question_info")
public class Questions {

	@Id
	@GeneratedValue
	private int qid;
	
	private String question;
	
	@OneToMany(targetEntity = Answers.class, cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="ans_ind")
	private List<Answers> ans_info;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAns_info() {
		return ans_info;
	}

	public void setAns_info(List<Answers> ans_info) {
		this.ans_info = ans_info;
	}
	
	
}
