package com.hjy;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hjy.jdbctemplate.JDBCUtils;
import com.hjy.jdbctemplate.Person;
public class Text {
	public static void main(String[] args) {

		findAllPerson();
		
	}

	private static void findAllPerson() {
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDataSource());
		String sql ="select * from person";
		List<Person> list = jt. query(sql, new BeanPropertyRowMapper<Person> (Person.class));
		 for (Person person : list) {
		        System. out. println(person);
		     }
	}
}