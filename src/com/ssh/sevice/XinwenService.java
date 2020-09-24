package com.ssh.sevice;

import java.util.List;

import com.ssh.shuju.Xinwen;;

public interface XinwenService {
	public void addxinwen(Xinwen x);
	public void updatexinwen(Xinwen x);
	public void removexinwen(Xinwen x);
	public List shuchuxinwens();
	public Xinwen shuchuxinwen(int id);
	public List shuchumohu(String mhname,String hks,String hjs);
	public List shuchulx(int cid);
}
