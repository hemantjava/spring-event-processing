package com.hemant.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
@Getter
public class EventData {
    Map<String, Object> data;
}
