package com.ssh.daoiml;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.CategoryDao;
import com.ssh.shuju.Category;

public class CategoryDaoiml extends HibernateDaoSupport implements CategoryDao {

	@Override
	public List getcategorys() {
		List list = (List)getHibernateTemplate().find("from Category");
		return list;
	}

	@Override
	public Category getcategory(int id) {
		Category c = getHibernateTemplate().load(Category.class,id);
		return c;
	}

	@Override
	public void saveorupdatecategory(Category c) {
		getHibernateTemplate().saveOrUpdate(c);
	}

	@Override
	public void removecategory(Category c) {
		getHibernateTemplate().delete(c);
	}

	@Override
	public List getlxxw(int id) {
		List list = (List)getHibernateTemplate().find("from Category where id="+id);
		return list;
	}

	@Override
	public void save(Category c) {
		getHibernateTemplate().save(c);
	}

	@Override
	public List getcategory1(int id) {
		List list = (List)getHibernateTemplate().find("select c from Category c,Xinwen x where c.id="+id);
		return list;
	}
}
