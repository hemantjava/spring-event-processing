package com.hemant.event;

import lombok.Builder;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
@Builder
public class UserEvent<T> extends ApplicationEvent {

    private T eventData;

    public UserEvent(T source) {
        super(source);
        this.eventData = source;
    }
}
