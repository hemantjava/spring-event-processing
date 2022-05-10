package com.hemant.event;

import com.hemant.dto.EventData;
import com.hemant.dto.User;
import com.hemant.utils.CommonUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class UserEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishUserCreatedEvent(User user) {
        Map<String, Object> data = CommonUtils.requestData();
        data.put("user", user);
        EventData eventData = new EventData(data);
        applicationEventPublisher.publishEvent(UserEvent.builder().eventData(eventData).build());
    }


}
