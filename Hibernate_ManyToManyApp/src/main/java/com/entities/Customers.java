package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="custInfo")
public class Customers {

	@Id
	@GeneratedValue
	private int cusid;
	private String cusname;
	
	@ManyToMany(targetEntity=Dishes.class, cascade=CascadeType.ALL)

	/*@JoinTable(
			name="cust_dish",
			joinColumns = {
					@JoinColumn(name="cusid")
			},
			inverseJoinColumns = {
					@JoinColumn(name="dishid")
			}
			)*/
	
	private List<Dishes>  dish;

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public List<Dishes> getDish() {
		return dish;
	}

	public void setDish(List<Dishes> dish) {
		this.dish = dish;
	}
	
	
}
