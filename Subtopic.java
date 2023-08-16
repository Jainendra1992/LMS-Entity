package com.website.lms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Subtopic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String subtopicName;
	private String subtopicDiscription;
	
	@ManyToOne
	@JsonIgnore
	private Topics topics;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubtopicName() {
		return subtopicName;
	}
	public void setSubtopicName(String subtopicName) {
		this.subtopicName = subtopicName;
	}
	public String getSubtopicDiscription() {
		return subtopicDiscription;
	}
	public void setSubtopicDiscription(String subtopicDiscription) {
		this.subtopicDiscription = subtopicDiscription;
	}
	
	
	
	
	
	
}
