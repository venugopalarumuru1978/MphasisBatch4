package com.emp_pack;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<empinfo> {

	@Override
	public empinfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		empinfo emp = new empinfo();
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		emp.setSal(rs.getFloat("sal"));
		emp.setDeptno(rs.getInt("deptno"));
		emp.setDname(rs.getString("dname"));
		emp.setLoc(rs.getString("location"));
		return emp;
	}
}
