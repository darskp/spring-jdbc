package com.jsp.SpringJdbc.Dao;

import com.jsp.SpringJdbc.entity.Student;

public interface StudentDao {
	
	int insert(Student student);
	int delete(Student student);
	int update(Student student);

}
