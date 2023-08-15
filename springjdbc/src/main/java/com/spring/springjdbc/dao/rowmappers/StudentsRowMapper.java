package com.spring.springjdbc.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.springjdbc.dto.Students;

public class StudentsRowMapper implements RowMapper<Students> {

	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Students students= new Students();
		students.setRoll(rs.getInt(1));
		students.setName(rs.getString(2));
		students.setCity(rs.getString(3));
		
		
		return null;
	}

}
