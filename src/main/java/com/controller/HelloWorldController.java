package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aaron on 2017/10/13.
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "你好世界...";
	}
}
