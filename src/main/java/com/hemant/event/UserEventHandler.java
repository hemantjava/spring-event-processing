package com.hemant.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class UserEventHandler<T> {

    @EventListener
    public void onUserCreated(UserEvent<T> event) throws JsonProcessingException {
        // 3rd party integration logic
        log.info("event: {}", new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(event.getEventData()));
    }
}
