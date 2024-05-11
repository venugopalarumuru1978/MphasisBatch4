package coms.DataJpaRelationship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="adrs_emp_tab")
public class Address {

	@Id
	@GeneratedValue
	private int adrsId;

	private String houseno;
	private String location;
	
	
	public int getAdrsId() {
		return adrsId;
	}
	public void setAdrsId(int adrsId) {
		this.adrsId = adrsId;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
