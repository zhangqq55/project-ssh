package com.ssh.seviceiml;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.GlydengluDao;
import com.ssh.sevice.GlydengluService;
import com.ssh.shuju.Glydenglu;

@Transactional(readOnly=false)
public class GlydengluServiceiml implements GlydengluService{
	@Resource
	private GlydengluDao glydengludao;
	@Override
	public Glydenglu shuchuglydenglu(int id) {
		return glydengludao.getglydenglu(id);
	}

}
