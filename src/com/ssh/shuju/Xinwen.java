package com.ssh.shuju;

import java.util.Date;

public class Xinwen {
	private int id;
	private String titlea;
	private String contenta;
	private String issuetime;
	private String ly;
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitlea() {
		return titlea;
	}
	public void setTitlea(String titlea) {
		this.titlea = titlea;
	}
	public String getContenta() {
		return contenta;
	}
	public void setContenta(String contenta) {
		this.contenta = contenta;
	}
	
	public String getIssuetime() {
		return issuetime;
	}
	public void setIssuetime(String issuetime) {
		this.issuetime = issuetime;
	}
	
	public String getLy() {
		return ly;
	}
	public void setLy(String ly) {
		this.ly = ly;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
