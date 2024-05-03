package coms.SpringBootWithJDbc.service;

import java.sql.Blob;
import java.util.List;

import coms.SpringBootWithJDbc.entities.StudentImages;



public interface StudentImgService {
	public String AddStudent(StudentImages stdimg);
	public List<StudentImages>  ViewAll();
	public Blob GetPhotoById(int stdid); 
}
