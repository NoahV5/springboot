package com.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Aaron on 2017/10/13.
 *
 * ApplicationStartedEvent：spring boot启动开始时执行的事件
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

	private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);

	@Override public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {

		SpringApplication app = applicationStartedEvent.getSpringApplication();
		app.setShowBanner(false);// 不显示banner信息
		logger.info("==MyApplicationStartedEventListener==");
		System.out.println("ApplicationStartedEvent");
	}
}
