package com.microsoft.azure.samples.hellospringboot.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
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
