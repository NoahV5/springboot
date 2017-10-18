package com.controller;

import com.pojo.Example;
import com.service.IExampleService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Aaron on 2017/10/17.
 */
@Controller
@RequestMapping(value = "/example")
public class ExampleController {

	@Resource
	private IExampleService exampleService;

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addExample(){
		Example example = new Example();
		example.setPassword("Aaron");
		example.setUsername("123456");
		try {
			exampleService.add(example);
		}catch (Exception e){
			e.printStackTrace();
		}
		return example.toString();
	}
}
