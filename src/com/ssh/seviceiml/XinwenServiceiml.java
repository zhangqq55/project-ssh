package com.ssh.seviceiml;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.CategoryDao;
import com.ssh.dao.XinwenDao;
import com.ssh.gouju.Goujulei;
import com.ssh.sevice.XinwenService;
import com.ssh.shuju.Category;
import com.ssh.shuju.Xinwen;

@Transactional(readOnly=false)
public class XinwenServiceiml implements XinwenService{
	@Resource
	private XinwenDao xinwendao; 
	@Resource
	private CategoryDao categorydao;
	@Resource
	private Goujulei gjl;
	@Override
	public void addxinwen(Xinwen x) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String saaa = sdf.format(new Date());
		x.setIssuetime(saaa);
		xinwendao.saveorupdatexinwen(x);
	}

	@Override
	public void updatexinwen(Xinwen x) {
		xinwendao.saveorupdatexinwen(x);
	}

	@Override
	public void removexinwen(Xinwen x) {
		xinwendao.removexinwen(x);
	}

	@Override
	public List shuchuxinwens() {
		List list = xinwendao.getxinwens();
		return list;
	}

	@Override
	public Xinwen shuchuxinwen(int id) {
		Xinwen x = xinwendao.getxinwen(id);
		return x;
	}

	@Override
	public List shuchumohu(String mhname, String hks, String hjs) {
		List list=null;
		hks = gjl.gsh(hks);hjs = gjl.gsh(hjs);
		if(mhname==null||mhname.equals("")){
			if((hks==null||hks.equals(""))&&(hjs==null||hjs.equals(""))){}
			else if(hks==null||hks.equals("")){
				list = xinwendao.gethks(hks, hjs, 2);
			}
			else if(hjs==null||hjs.equals("")){
				list = xinwendao.gethks(hks, hjs,1);
			}
			else{
				list = xinwendao.gethks(hks, hjs,0);
			}
		}
		else{
			if((hks==null||hks.equals(""))&&(hjs==null||hjs.equals(""))){
				list = xinwendao.getmohu(mhname);
			}
			else if(hks==null||hks.equals("")){
				list = xinwendao.getmohusj(mhname, hks, hjs, 2);
			}
			else if(hjs==null||hjs.equals("")){
				list = xinwendao.getmohusj(mhname, hks, hjs, 1);
			}
			else{
				list = xinwendao.getmohusj(mhname, hks, hjs, 0);
			}
		}
		return list;
	}

	@Override
	public List shuchulx(int cid) {
		Category c = categorydao.getcategory(cid);
		return xinwendao.getxwlx(c);
	}

	

}
