package com.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Administrator on 2017/10/14.
 * ApplicationPreparedEvent:spring boot上下文context创建完成，
 * 但此时spring中的bean是没有完全加载完成的。
 */
public class MyApplicationPreparedEvent implements ApplicationListener<ApplicationPreparedEvent>{
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        ConfigurableApplicationContext cac = applicationPreparedEvent.getApplicationContext();
        passContextInfo(cac);
    }

    /**
     * @param configurableApplicationContext
     * 在获取完上下文后，可以将上下文传递出去做一些额外的操作。
     */
    private void passContextInfo(ConfigurableApplicationContext configurableApplicationContext) {
        //TODO
    }
}
