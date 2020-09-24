package com.ssh.dao;

import java.util.List;

import com.ssh.shuju.Category;
import com.ssh.shuju.Xinwen;

public interface XinwenDao {
	public List getxinwens();
	public Xinwen getxinwen(int id);
	public void saveorupdatexinwen(Xinwen x);
	public void removexinwen(Xinwen x);
	public List getmohu(String mhname);
	public List gethks(String hks,String hjs,int lx);
	public List getmohusj(String mhname,String hks,String hjs,int lx);
	public List getxwlx(Category c);
}
