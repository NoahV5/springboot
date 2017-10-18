package com.service.impl;

import com.dao.IExampleDao;
import com.pojo.Example;
import com.service.IExampleService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by Aaron on 2017/10/17.
 */
@Service
public class ExampleServiceImpl implements IExampleService {

	@Resource
	private IExampleDao exampleDao;

	@Override public int add(Example account) {
		return exampleDao.add(account);
	}

	@Override public int update(Example account) {
		return exampleDao.update(account);
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
