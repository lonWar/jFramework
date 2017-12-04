package com.jd.ebs.jframework.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/1
 */
@RestController
public class TestController {

    @RequestMapping("/")
    Object home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    Object test() {
        Map<String, Object> rMap = new HashMap<String, Object>();
        rMap.put("code", 0);
        rMap.put("msg", "成功");
        rMap.put("data", null);
        return rMap;
    }

}
