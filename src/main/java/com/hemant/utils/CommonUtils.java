package com.hemant.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommonUtils {
    public static Map<String, Object> requestData() {
        Map<String, Object> requestData = new HashMap<>();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        requestData.put("host", request.getHeader("host"));
        requestData.put("User-Agent", request.getHeader("User-Agent"));
        return requestData;
    }
}
