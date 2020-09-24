package com.ssh.daoiml;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.GlydengluDao;
import com.ssh.shuju.Glydenglu;

public class GlydengluDaoiml extends HibernateDaoSupport implements GlydengluDao {

	@Override
	public Glydenglu getglydenglu(int id) {
		try{
		Glydenglu g = getHibernateTemplate().load(Glydenglu.class, id);
		return g;
		}
		catch(Exception e){
			return null;
		}
	}

}
