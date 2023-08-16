package com.website.lms.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Package {
	
	    @Id  // primery key
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 
	    private Integer id;
	    private String PackageName;
	    private Integer PackageFees;
	    private String PackageDuration;
	    private  Integer PackageHours;
	    @ManyToMany
	    private List<Skill> skill = new ArrayList<Skill>();
	    
	    @ManyToMany
	    private List<Student> students = new ArrayList<Student>();
	    		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getPackageName() {
			return PackageName;
		}
		public void setPackageName(String packageName) {
			PackageName = packageName;
		}
		public Integer getPackageFees() {
			return PackageFees;
		}
		public void setPackageFees(Integer packageFees) {
			PackageFees = packageFees;
		}
		public String getPackageDuration() {
			return PackageDuration;
		}
		public void setPackageDuration(String packageDuration) {
			PackageDuration = packageDuration;
		}
		public Integer getPackageHours() {
			return PackageHours;
		}
		public void setPackageHours(Integer packageHours) {
			PackageHours = packageHours;
		}
	

}


/*
   {
     "id":101,
     "packageName":"java",
     "packageFees":3000,
     "packageDuration":"6month",
     "packageHours":52   
   }
  
 * */
