package com.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.sevice.CategoryService;
import com.ssh.shuju.Category;
import com.ssh.shuju.Xinwen;

public class Categoryaction extends ActionSupport implements ModelDriven{
	@Resource
	private Category category;
	@Resource
	private CategoryService categoryservice;
	private List list;
	private int idid,idkong;
	@Override
	public Object getModel() {
		return category;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getIdid() {
		return idid;
	}
	public void setIdid(int idid) {
		this.idid = idid;
	}
	
	public Category getCategory() {
		return category;
	}
	public String Cxcategory() throws Exception{
		list = categoryservice.shuchucategorys();
		return SUCCESS;
	}
	public String Cxleixxw() throws Exception{
		category = (Category)categoryservice.shuchu1(idid).get(0);
		return "leixin";
	}
	public String Addscategory() throws Exception{
		category.setId(idkong);
		categoryservice.addcategory(category);
		System.out.println(category.getCategoryname());
		return "addcg";
	}
	public String Cxcate() throws Exception{
		list = categoryservice.shuchucategorys();
		System.out.println(list.size());
		if(list.size()<=0||list==null){
			addFieldError("categoryname","您还未添加类型，现在类型完全为空");
			return "kong";
		}
		return "you";
	}
	public String Zzcategory() throws Exception{
		return "xgcsh";
	}
	public String Gxcategory() throws Exception{
		categoryservice.addcategory(category);
		return "gxcg";
	}
	public String Sccategory() throws Exception{
		categoryservice.removecategory(category);
		return "sccg";
	}
	public void validateAddscategory(){
		System.out.println("123");
		if(category.getCategoryname().equals("")){
			addFieldError("categoryname","类型不能为空");
		}
	}
}
