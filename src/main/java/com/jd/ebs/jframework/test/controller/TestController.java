package com.jd.ebs.jframework.test.controller;

import com.jd.ebs.jframework.test.mapper.UserTestMapper;
import com.jd.oa.api.service.ProcessCenterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/1
 */
@RestController
public class TestController {

    @Resource
    private UserTestMapper userTestMapper;

    @Resource
    private ProcessCenterService processCenterService;

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

    @RequestMapping("/user/list")
    Object userList() {
        return userTestMapper.selectAll();
    }

    @RequestMapping("/test/oa/request")
    Object requestPAFFormDefinition() {
        String reqXml = processCenterService.requestPAFFormDefinition("bd00aeb7450b486e9e5e4d1a1a3aba28");
        return reqXml;
    }

}
