package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CrkInfos")
public class Cricket {
	
	@Id
	private int crkid;
	private String crkname;
	private int runs;
	
	public int getCrkid() {
		return crkid;
	}
	public void setCrkid(int crkid) {
		this.crkid = crkid;
	}
	public String getCrkname() {
		return crkname;
	}
	public void setCrkname(String crkname) {
		this.crkname = crkname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
}
