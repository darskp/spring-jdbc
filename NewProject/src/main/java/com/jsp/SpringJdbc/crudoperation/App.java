package com.jsp.SpringJdbc.crudoperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jsp.SpringJdbc.Dao.StudentDao;
import com.jsp.SpringJdbc.Dao.StudentImpl;
import com.jsp.SpringJdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("START MAIN");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jsp/SpringJdbc/crudoperation/jdbcconfig.xml");
		StudentDao a=context.getBean("Student1",StudentImpl.class);
		
//		creating the object using - new
//		Student s=new Student();
//		s.setUSN("3");
//		s.setName("Darshan3");
//		s.setCity("Bangalore");
		
		//IOC to manage
		
		Student st=context.getBean("StudentBean",Student.class);
//		int b=a.insert(st);
//		int b=a.delete(st);
		int b=a.update(st);
		System.out.println(b);
		System.out.println("END MAIN");
	}
}
