package com.testyanthra.list_type;

import java.util.List;

public class Student 
{
	private int id;
	private String name;
	 private List <String> Subjects;
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Subjects=" + Subjects + "]";
	}
	
   
}
