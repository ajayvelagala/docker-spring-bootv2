package com.myeg.springBootDemo.controller;

public class StockMasterDto {

	private String id;
	private String  name;
	private String sal;
	
    public StockMasterDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StockMasterDto(String id, String name, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "StockMasterDto [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}
