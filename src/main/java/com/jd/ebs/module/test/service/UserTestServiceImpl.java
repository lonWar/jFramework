package com.jd.ebs.module.test.service;

import com.jd.ebs.jframework.service.BaseService;
import com.jd.ebs.jframework.web.ResponseObject;
import com.jd.ebs.module.test.mapper.UserTestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/6
 */
@Service("userTestService")
public class UserTestServiceImpl extends BaseService implements UserTestService {

    @Resource
    private UserTestMapper userTestMapper;

    @Override
    public ResponseObject getAllUser() {
        return getSuccessResult(userTestMapper.selectAll());
    }
}
