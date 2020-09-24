package com.ssh.daoiml;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.XinwenDao;
import com.ssh.shuju.Category;
import com.ssh.shuju.Xinwen;

public class XinwenDaoiml extends HibernateDaoSupport implements XinwenDao{

	@Override
	public List getxinwens() {
		List list = (List)getHibernateTemplate().find("from Xinwen");
		return list;
	}

	@Override
	public Xinwen getxinwen(int id) {
		Xinwen x = getHibernateTemplate().load(Xinwen.class,id);
		return x;
	}

	@Override
	public void saveorupdatexinwen(Xinwen x) {
		getHibernateTemplate().saveOrUpdate(x);
	}

	@Override
	public void removexinwen(Xinwen x) {
		getHibernateTemplate().delete(x);
	}

	@Override
	public List getmohu(String mhname) {
		List list = (List)getHibernateTemplate().find("from Xinwen where titlea like ?","%"+mhname+"%");
		return list;
	}

	@Override
	public List gethks(String hks, String hjs, int lx) {
		List list = null;
		if(lx==0){
			list = (List)getHibernateTemplate().find("from Xinwen where issuetime between ? and ?",hks,hjs);
		}
		else if(lx==1){
			list = (List)getHibernateTemplate().find("from Xinwen where issuetime>=?",hks);
		}
		else{
			list = (List)getHibernateTemplate().find("from Xinwen where issuetime<=?",hjs);
		}
		return list;
	}

	@Override
	public List getmohusj(String mhname, String hks, String hjs, int lx) {
		List list = null;
		if(lx==0){
			list = (List)getHibernateTemplate().find("from Xinwen where titlea like ? and issuetime between ? and ?","%"+mhname+"%",hks,hjs);
		}
		else if(lx==1){
			list = (List)getHibernateTemplate().find("from Xinwen where titlea like ? and issuetime>=?","%"+mhname+"%",hks);
		}
		else{
			list = (List)getHibernateTemplate().find("from Xinwen where titlea like ? and issuetime<=?","%"+mhname+"%",hjs);
		}
		return list;
	}

	@Override
	public List getxwlx(Category c) {
		List list = (List)getHibernateTemplate().find("from Xinwen where category = ?",c);
		return list;
	}

}
