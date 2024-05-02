package coms.RestAPIDataJpaApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Crick_Info")
@Getter
@Setter
public class CricInfo {

	@Id
	@GeneratedValue
	private int crid;
	
	private String crname;
	private String game;
	private int runs;
	
	
}
