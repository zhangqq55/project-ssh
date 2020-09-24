package com.ssh.dao;

import java.util.List;

import com.ssh.shuju.Category;

public interface CategoryDao {
	public List getcategorys();
	public Category getcategory(int id);
	public void save(Category c);
	public void saveorupdatecategory(Category c);
	public void removecategory(Category c);
	public List getlxxw(int id);
	public List getcategory1(int id);
}
