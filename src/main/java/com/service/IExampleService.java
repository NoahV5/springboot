package com.service;

import com.pojo.Example;
import java.util.List;

/**
 * Created by Aaron on 2017/10/17.
 */
public interface IExampleService {

	int add(Example account);

	int update(Example account);

	int delete(int id);

	Example findAccountById(int id);

	List<Example> findAccountList();
}
