package com.ssh.sevice;

import java.util.List;

import com.ssh.shuju.Category;

public interface CategoryService {
	public void addcategory(Category c);
	public void updatecategory(Category c);
	public void removecategory(Category c);
	public List shuchucategorys();
	public Category shuchucategory(int id);
	public List shuchulx(int id);
	public List shuchu1(int id);
}
