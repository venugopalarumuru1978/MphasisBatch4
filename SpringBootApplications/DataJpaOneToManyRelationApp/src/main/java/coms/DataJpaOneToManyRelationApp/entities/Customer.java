package coms.DataJpaOneToManyRelationApp.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cust_info_tab")
public class Customer {

	@Id
	@GeneratedValue
	private int cusid;
	private String custname;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cusid")
	private List<Products>  prds;

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Products> getPrds() {
		return prds;
	}

	public void setPrds(List<Products> prds) {
		this.prds = prds;
	}
	
	
}
