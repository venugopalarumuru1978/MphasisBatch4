package coms.RestAPIDataJpaApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adminusers")
public class AdminInfo {

	@Id
	@GeneratedValue
	@Column(name="admid")
	private int adminid;
	
	@Column(name="admin_username")
	private String username;
	
	@Column(name="admin_pwd")
	private String password;
	
	
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
