package com.dao.impl;

import com.pojo.Example;
import com.dao.IExampleDao;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Aaron on 2017/10/17.
 */
@Component
public class ExampleDaoImpl implements IExampleDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override public int add(Example example) {
		return jdbcTemplate.update("insert into example(username, password) values(?, ?)",
				example.getUsername(),example.getPassword());
	}

	@Override public int update(Example account) {
		return jdbcTemplate.update("UPDATE example SET password = 'Noah' WHERE username = 'Noah'",account.getUsername());
	}

	@Override public int delete(int id) {
		return 0;
	}

	@Override public Example findAccountById(int id) {
		return null;
	}

	@Override public List<Example> findAccountList() {
		return null;
	}
}
