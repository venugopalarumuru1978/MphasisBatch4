package coms.DataJpaOneToManyRelationApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prd_info_tab")
public class Products {

	@Id
	@GeneratedValue
	private int prdid;
	
	private String prdname;
	private float price;
	
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
