package com.ssh.action;

import java.util.Map;


import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.sevice.GlydengluService;
import com.ssh.shuju.Glydenglu;

public class Glydengluaction extends ActionSupport implements ModelDriven {
	@Resource
	private GlydengluService glydengluservice;
	@Resource
	private Glydenglu glydenglu;
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return glydenglu;
	}
	
	public String Yzdenglu(){
		return dlyz();
	}
	public String dlyz(){
		Glydenglu g = glydengluservice.shuchuglydenglu(glydenglu.getId());
		if(g!=null){
			if(g.getPassword().equals(glydenglu.getPassword())){
				return SUCCESS;
			}
			else{
				System.out.println("�������");
				addFieldError("password","�������");
				return "nopassword";
			}
		}
		else{
			System.out.println("û���û�");
			addFieldError("id","�û��˺Ų�����");
			return "noyonghu";
		}
	}
	public void validateYzdenglu(){
		if(glydenglu.getId()==0){
			addFieldError("id","�������˺�");
		}
		else if(glydenglu.getPassword().equals("")){
			addFieldError("password","����������");
		}
	}
}
	