package coms.SpringBootWithJDbc.controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import coms.SpringBootWithJDbc.entities.StudentImages;
import coms.SpringBootWithJDbc.service.StudentImgService;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/MyImgApp")
public class StudentImgController {
	
	@Autowired
	StudentImgService sis;
	
	@GetMapping("/stdimg")
	public String AddNewStudent(Model m)
	{
		m.addAttribute("student", new StudentImages());
		return "AddStudent";
	}
	@PostMapping("/stdimgprocess")
	public String AddNewStudent(@ModelAttribute StudentImages student,
			@RequestParam  MultipartFile  uploadImg, Model m) throws Exception
	{
		System.out.println("File Name: " + uploadImg.getOriginalFilename());
		System.out.println("File Size : " + uploadImg.getSize());
		long size = uploadImg.getSize(); 
//		if(size>=65535)
//		{
//		m.addAttribute("info", "File size should not exceeed 65635 bytes");
		//}
		//else
		//{
			student.setStdimage(uploadImg.getBytes());
			if(sis.AddStudent(student).equals("Success"))
			m.addAttribute("info", "Student is Added....");
		//}
		m.addAttribute("student", new StudentImages());
		return "AddStudent";
	}
	
	@GetMapping("/stdall")
	public String StudentAll(Model m)
	{
		List<StudentImages>  stdlist = sis.ViewAll();
		m.addAttribute("stdlist", stdlist);
		return "ViewAllPages";
	}
	
	@GetMapping("/getStudentPhoto/{id}")
	public void getPersonInfo(@PathVariable int id, HttpServletResponse response) throws IOException, SQLException
	{
		response.setContentType("image/jpeg");
		
		Blob ph =  sis.GetPhotoById(id);
		
		byte[] bytes = ph.getBytes(1, (int)ph.length());
		InputStream strm = new ByteArrayInputStream(bytes);
		IOUtils.copy(strm, response.getOutputStream());
	}
}

//http://localhost:9098/MyImgApp/stdimg