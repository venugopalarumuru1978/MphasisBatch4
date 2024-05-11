package coms.DataJpaOneToManyRelationApp.entities;

public class CusResponse {

	private String custname;
	private String prdname;
	
	public CusResponse(String custname, String prdname) {
		super();
		this.custname = custname;
		this.prdname = prdname;
	}
	
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	
	
}
