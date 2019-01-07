package com.microsoft.azure.samples.hellospringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	 @Column
	 private String name;
	 
	public String getName() {
		return name;
	}
	public void setName(String ename) {
		this.name = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	@Override
	public String toString(){
		return "\nID="+getId()+"::Name"+getName() ;
	}
	 
	 

}
