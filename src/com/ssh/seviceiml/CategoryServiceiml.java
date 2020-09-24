package com.ssh.seviceiml;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.CategoryDao;
import com.ssh.sevice.CategoryService;
import com.ssh.shuju.Category;

@Transactional(readOnly=false)
public class CategoryServiceiml implements CategoryService {
	@Resource
	private CategoryDao categorydao;
	@Override
	public void addcategory(Category c) {
		categorydao.saveorupdatecategory(c);
	}

	@Override
	public void updatecategory(Category c) {
		categorydao.saveorupdatecategory(c);
	}

	@Override
	public void removecategory(Category c) {
		categorydao.removecategory(c);
	}

	@Override
	public List shuchucategorys() {
		List list = categorydao.getcategorys();
		return list;
	}

	@Override
	public Category shuchucategory(int id) {
		Category c = categorydao.getcategory(id);
		return c;
	}

	@Override
	public List shuchulx(int id) {
		return categorydao.getlxxw(id);
	}

	@Override
	public List shuchu1(int id) {
		return categorydao.getcategory1(id);
	}

}
