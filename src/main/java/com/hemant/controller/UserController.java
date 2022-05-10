package com.hemant.controller;

import com.hemant.dto.User;
import com.hemant.event.UserEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserEventPublisher userEventPublisher;

    @GetMapping(value = "/")
    public User getUsers() {
        final User build = User.builder().id("1232").name("Hemant").build();
        userEventPublisher.publishUserCreatedEvent(build);
        return build;
    }
}
