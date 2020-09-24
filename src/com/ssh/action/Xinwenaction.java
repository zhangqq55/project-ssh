package com.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.gouju.Goujulei;
import com.ssh.sevice.CategoryService;
import com.ssh.sevice.XinwenService;
import com.ssh.shuju.Category;
import com.ssh.shuju.Xinwen;

public class Xinwenaction extends ActionSupport implements ModelDriven {
	
	@Resource
	private Xinwen xinwen;
	@Resource
	private Category category;
	@Resource
	private XinwenService xinwenservice;
	@Resource
	private CategoryService categoryservice;
	private List list,lista;
	private String mohuname;
	private String hks;
	private String hjs;
	private int cid,idkong;
	
	@Override
	public Object getModel() {
		return xinwen;
	}
	
	public Xinwen getXinwen() {
		return xinwen;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	public List getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public String getMohuname() {
		return mohuname;
	}

	public void setMohuname(String mohuname) {
		this.mohuname = mohuname;
	}
	
	public String getHks() {
		return hks;
	}

	public void setHks(String hks) {
		this.hks = hks;
	}

	public String getHjs() {
		return hjs;
	}

	public void setHjs(String hjs) {
		this.hjs = hjs;
	}

	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String Cxmohu(){
		list = xinwenservice.shuchumohu(mohuname, hks, hjs);
		return "mohucg";
	}
	public String Zzaddxinwen() throws Exception{
		list = categoryservice.shuchucategorys();
		if(list.size()<=0||list==null){
			addFieldError("categoryname","您还未添加类型，现在类型完全为空");
			return "xwkong";
		}
		return "xwyou";
	}
	public String Addxinwen() throws Exception{
		//ljx.addCategory(xinwen,cid);
		xinwen.setId(idkong);
		category = categoryservice.shuchucategory(cid);
		xinwen.setCategory(category);
		xinwenservice.addxinwen(xinwen);
		return SUCCESS;
	}
	public String Cxxinwen() throws Exception{
		list = categoryservice.shuchucategorys();
		lista = xinwenservice.shuchuxinwens();
		return "xwcxcg";
	}
	public String Xgzz() throws Exception{
		list = categoryservice.shuchucategorys();
		xinwen = xinwenservice.shuchuxinwen(xinwen.getId());
		return "xwgxcg1";
	}
	public String Xgxinwen() throws Exception{
		category = categoryservice.shuchucategory(cid);
		xinwen.setCategory(category);
		xinwenservice.addxinwen(xinwen);
		return "xwgxcg2";
	}
	public String Scxinwen() throws Exception{
		xinwenservice.removexinwen(xinwen);
		return "xwsccg1";
	}
	public String Cxxinwenlx() throws Exception{
		list = categoryservice.shuchucategorys();
		if(cid==0) lista = xinwenservice.shuchuxinwens();
		else lista = xinwenservice.shuchulx(cid);
		System.out.println(cid);
		return "xwlxcxcg";
	}
	public String Cxnr() throws Exception{
		xinwen = xinwenservice.shuchuxinwen(xinwen.getId());
		return "xwckcg11";
	}
	public void validateAddxinwen(){
		list = categoryservice.shuchucategorys();
		//System.out.println("123");
		if(cid==0){
			addFieldError("cid","类型没有选择");
		}
		else if(xinwen.getTitlea().equals("")){
			addFieldError("titlea","标题不能为空");
		}
		else if(xinwen.getContenta().equals("")){
			addFieldError("contenta","内容不能为空");
		}
		else if(xinwen.getLy().equals("")){
			addFieldError("ly","来源不能为空");
		}
	}
}
