package com.lambdaexpression_pack;

public class Persons {

	private int pid;
	private String pname;
	private int age;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Persons(int pid, String pname, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
}
