package com.grizzlyweblab.spring.jdbc;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestJdbc {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/grizzlyweblab/spring/jdbc/jdbcConfig.xml");
		
		JdbcTemplate jdbcTemplate =context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		//Insert Query
		String query="insert into Student(stdId,StdName,stdAddress,stdDob) values(?,?,?,?)";
		
		//fire query
		int res = jdbcTemplate.update(query, 91100, "AAAA", "Apppp", new Date());
		//fire query
		res = jdbcTemplate.update(query, 91100, "AAAA", "Apppp", new Date());
		res = jdbcTemplate.update(query, 91101, "AAAA", "Apppp", new Date());
		res = jdbcTemplate.update(query, 91102, "AAAA", "Apppp", new Date());
		
		System.out.println("No. of recoed inserted : "+ res);
		
		query="update Student set stdName=? where stdId=?";
		res = jdbcTemplate.update(query, "BBBB",91102);
		System.out.println("No. of record updated : "+ res);
		
		query="delete from Student where stdId=?";
		res = jdbcTemplate.update(query, 91102);
		System.out.println("No. of record deleted : "+ res);
		
		query="select * from Student";
		//res = jdbcTemplate.query(query);
		
		
		
	}
}
