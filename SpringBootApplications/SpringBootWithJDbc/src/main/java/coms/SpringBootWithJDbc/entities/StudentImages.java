package coms.SpringBootWithJDbc.entities;

import lombok.Getter;
import lombok.Setter;

/*
 * Create Table StudentImages(stdid int auto_increment primary key, 
stdname varchar(40), stdimage  longblob);
 */
@Getter
@Setter
public class StudentImages {

	private int stdid;
	private String stdname;
	private  byte[]	stdimage;  //which refers blob in database.
}
