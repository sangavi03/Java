package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbc {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public void getData() {
		//jdbcTemplate.batchUpdate(sql)
		//	jdbcTemplate.execute(sql);
		//	jdbcTemplate.query(sql, rse)
		//	jdbcTemplate.query(sql, args, rowMapper)
	List li = jdbcTemplate.queryForList("select * from employee");
	Iterator i =li.iterator();
	while(i.hasNext()) {
		Object o=i.next();
		System.out.println(o.toString());
	}
	}
}
