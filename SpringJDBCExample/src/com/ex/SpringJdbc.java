package com.ex;

import java.util.List;

import org.apache.lucene.util.packed.PackedLongValues.Iterator;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbc {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void getData() {
		//jdbcTemplate.batchUpdate(sql);
		//jdbcTemplate.execute(sql);
		//jdbcTemplate.execute(psc, action)
		//jdbcTemplate.query(sql, rowMapper)
		//jdbcTemplate.queryForList(sql)
		
		List li=jdbcTemplate.queryForList("select * from employee");
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o.toString());
		}
	}
	
}
