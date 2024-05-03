package coms.SpringBootWithJDbc.service;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.SpringBootWithJDbc.entities.StudentImages;

@Service
public class StudentImgServiceImpl implements StudentImgService {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public String AddStudent(StudentImages stdimg) {
		String sqlcmd = "Insert into StudentImages(stdname, stdimage) values(?,?)";
		int res = jdbc.update(sqlcmd, new Object[] {stdimg.getStdname(), stdimg.getStdimage()});
		if(res>=1)
			return "Success";
		return "err";
	}

	@Override
	public List<StudentImages> ViewAll() {
		List<StudentImages> stdList = jdbc.query("select * from StudentImages", new BeanPropertyRowMapper(StudentImages.class));
		return stdList;
	}

	@Override
	public Blob GetPhotoById(int stdid) {
	String qry = "Select stdimage from  StudentImages where stdid=?";
		
		Blob photo = jdbc.queryForObject(qry, new Object[] {stdid}, Blob.class);		
		return photo;
	}
}
