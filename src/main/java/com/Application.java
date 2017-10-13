package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Aaron on 2017/10/13.
 *
 * SpringBootApplication 注解相当于
 * 		@Configuration : 表示Application作为sprig配置文件存在
 * 		@EnableAutoConfiguration: 启动spring boot内置的自动配置
 * 		@ComponentScan : 扫描bean，路径为Application类所在package以及package下的子路径，
 * 		这里为 com.lkl.springboot，在spring boot中bean都放置在该路径已经子路径下。
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class);
	}
}
