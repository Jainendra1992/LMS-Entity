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
public class Skill {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String skillName;
	private String skillDesc;
	
	@OneToMany(mappedBy ="skill", cascade = CascadeType.ALL)
	@JsonIgnore
    private List<Topics> topics = new ArrayList<Topics>();
	
	
	public List<Topics> getTopics() {
		return topics;
	}
	public void setTopics(List<Topics> topics) {
		this.topics = topics;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	
}


/*
    {
          "id":1,
         "skillName":"java",
         "skillDesc":"programering"
    } 
 * */
