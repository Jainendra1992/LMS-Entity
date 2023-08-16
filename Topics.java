package com.website.lms.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Topics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer topicsId;
	private String topicsName;
	private String topicsDiscription;
	
	@ManyToOne
	private Skill skill;
	
	@OneToMany(mappedBy ="topics", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Subtopic> subtopics = new ArrayList<Subtopic>();

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getTopicsId() {
		return topicsId;
	}

	public void setTopicsId(Integer topicsId) {
		this.topicsId = topicsId;
	}

	public String getTopicsName() {
		return topicsName;
	}

	public void setTopicsName(String topicsName) {
		this.topicsName = topicsName;
	}

	public String getTopicsDiscription() {
		return topicsDiscription;
	}

	public void setTopicsDiscription(String topicsDiscription) {
		this.topicsDiscription = topicsDiscription;
	}

	public List<Subtopic> getSubtopics() {
		return subtopics;
	}

	public void setSubtopics(List<Subtopic> subtopics) {
		this.subtopics = subtopics;
	}
	
	
	
	
	
}
/*
    {
          "skill":1, 
         "topicsId":101,
         "topicsName":"java",
         "topicsDiscription":"programing"

    }
 
 
 
 * 
 * */
 