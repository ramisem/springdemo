package com.springdemo.events;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(final Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Custom event called.";
    }
}
