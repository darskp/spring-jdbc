package com.jsp.SpringJdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jsp.SpringJdbc.entity.Student;

public class StudentImpl implements StudentDao {

	private JdbcTemplate a;

	public JdbcTemplate getA() {
		return a;
	}

	public void setA(JdbcTemplate a) {
		this.a = a;
	}

	@Override
	public int insert(Student student) {
		String query = "insert into jdbcspring.student values(?,?,?)";
		int b = a.update(query, student.getUSN(), student.getName(), student.getCity());
		return b;
	}
	@Override
	public int delete(Student student) {
		String query = "delete from jdbcspring.student where USN=?";
		int b = a.update(query, student.getUSN());
		return b;
	}
	@Override
	public int update(Student student) {
		String query = "update jdbcspring.student set Name=? where USN=?";
		int b = a.update(query, student.getName(),student.getUSN());
		return b;
	}
}
