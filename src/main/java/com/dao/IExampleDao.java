package com.dao;

import com.pojo.Example;
import java.util.List;

/**
 * Created by Aaron on 2017/10/17.
 * SpringBoot用JdbcTemplates访问Mysql
 */
public interface IExampleDao {

	int add(Example account);

	int update(Example account);

	int delete(int id);

	Example findAccountById(int id);

	List<Example> findAccountList();

}
