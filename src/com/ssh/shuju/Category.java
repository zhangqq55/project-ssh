package com.ssh.shuju;

import java.util.HashSet;

import java.util.Set;

public class Category {
	private int id;
	private String categoryname;
	private Set<Xinwen> xinwen = new HashSet<Xinwen>();
	
	public Category(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Set<Xinwen> getXinwen() {
		return xinwen;
	}
	public void setXinwen(Set<Xinwen> xinwen) {
		this.xinwen = xinwen;
	}
	
	
	

}
