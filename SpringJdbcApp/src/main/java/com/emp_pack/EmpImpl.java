package com.emp_pack;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class EmpImpl {

	private DataSource dataSource;
	private JdbcTemplate template;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		template = new JdbcTemplate(dataSource);
		//System.out.println("Connected...");
	}
	
	public List<empinfo>  ShowAllEmps()
	{
		String qry = "SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO, D.DNAME, D.LOCATION FROM EMP AS E INNER JOIN DEPT AS D ON D.DEPTNO = E.DEPTNO";
		List<empinfo> elist = template.query(qry, new EmpRowMapper());
		return elist;
	}
	
}
