package com.ssh.gouju;

public class Goujulei {
	public String gsh(String sj){
		String s = "";
		try{
			String a[] = sj.split("T");
			s  =a[0]+" "+a[1]+":00";
		}
		catch(Exception e){
			return "";
		}
		return s;
	}
}
