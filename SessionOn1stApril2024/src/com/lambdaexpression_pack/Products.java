package com.lambdaexpression_pack;

public class Products {

	private int pid;
	private String prdName;
	private int stock;
	private String cat;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
	public Products(int pid, String prdName, int stock, String cat) {
		super();
		this.pid = pid;
		this.prdName = prdName;
		this.stock = stock;
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "[Product ID =" + pid + ",Product Name=" + prdName + ", Stock=" + stock + ", Category=" + cat + "]";
	}
	
	
}
