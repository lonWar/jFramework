package com.jd.ebs.jframework.service;

import com.jd.ebs.jframework.common.FrameworkConstants;
import com.jd.ebs.jframework.web.ResponseObject;
import com.jd.ebs.jframework.web.SpringContextHolder;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Created by jinlong.hao on 16/5/20.
 */
public class BaseService {

    private MessageSource messageSource;

    /**
     * 不用PostConstruct注解通过实现InitializingBean接口也可以
     */
    @PostConstruct
    public void init() {
        this.messageSource = SpringContextHolder.getBean("messageSource", MessageSource.class);
    }

    /**
     * 获取成功返回结果
     * @param data
     * @return
     */
    public ResponseObject getSuccessResult(Object data) {
        return new ResponseObject(FrameworkConstants.HTTP_RESPONSE_CODE_SUCCESS, "", data);
    }

    /**
     * 获取错返回结果(无参数替换)
     * @param errorCode
     * @return
     */
    public ResponseObject getFailureResult(int errorCode) {
//        return new ResponseObject(errorCode, PropertiesUtil.getResponseErrorMessageByCode(errorCode), null);
        String msg = messageSource.getMessage("response.error." + errorCode, null, Locale.getDefault());
        return new ResponseObject(errorCode, msg, null);
    }

    /**
     * 获取错返回结果(带参数替换)
     * @param errorCode
     * @param params
     * @return
     */
    public ResponseObject getFailureResult(int errorCode, String... params) {
//        return new ResponseObject(errorCode, PropertiesUtil.getResponseErrorMessageByCode(errorCode, params), null);
        String msg = messageSource.getMessage("response.error." + errorCode, params, Locale.getDefault());
        return new ResponseObject(errorCode, msg, null);
    }

}
