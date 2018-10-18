package com.springdemo.events.listener;

import com.springdemo.events.CustomEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(final ApplicationEvent event) {
        if (event instanceof CustomEvent){
            System.out.println(event.toString());
        }
    }
}
