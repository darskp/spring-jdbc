package com.jsp.SpringJdbc.crudoperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("START MAIN");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jsp/SpringJdbc/crudoperation/jdbcconfig.xml");
		
		JdbcTemplate a= context.getBean("Jdbctemplate",JdbcTemplate.class);
		
		//insert
//		int b=a.update("insert into jdbcspring.student values(?,?,?)","1","Darshan","Kumta");
		
		//delete
//		int b=a.update("Delete from jdbcspring.student where USN=? and name=?",1,"Darshan");
		
		//update
//		String query="Update jdbcspring.student set Name=? where USN=?";
//		int b=a.update(query,"Darshan2",1);
		
		//read
		String query="select * from jdbcspring.student";
		System.out.println(a.update(query));
		System.out.println("END MAIN");
	}
}
