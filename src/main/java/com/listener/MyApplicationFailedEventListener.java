package com.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/10/14.
 * ApplicationFailedEvent:spring boot启动异常时执行事件
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        Throwable throwable = applicationFailedEvent.getException();
        handleThrowable(throwable);
    }

    /**
     * 处理异常
     * @param throwable
     */
    private void handleThrowable(Throwable throwable) {
        //TODO
    }
}
