package com;

import com.listener.MyApplicationFailedEventListener;
import com.listener.MyApplicationPreparedEvent;
import com.listener.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

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
public class MyApplication {

	public static void main(String[] args){
		//注册监听器
		SpringApplication application = new SpringApplication(MyApplication.class);
		application.addListeners(new MyApplicationStartedEventListener());
		application.addListeners(new MyApplicationPreparedEvent());
		application.addListeners(new MyApplicationFailedEventListener());
		application.run(args);
	}
}

