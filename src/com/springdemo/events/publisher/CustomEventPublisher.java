package com.springdemo.events.publisher;

import com.springdemo.events.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(final ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }

    public void publishCustomEvent(){
        CustomEvent customEvent=new CustomEvent(this);
        this.applicationEventPublisher.publishEvent(customEvent);
    }
}
