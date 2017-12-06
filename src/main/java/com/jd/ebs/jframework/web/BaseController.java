package com.jd.ebs.jframework.web;

import com.jd.ebs.jframework.common.FrameworkConstants;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by jinlong.hao on 16/5/19.
 */
public class BaseController {

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
     *
     * @param data
     * @return
     */
    public ResponseObject getSuccessResult(Object data) {
        return new ResponseObject(FrameworkConstants.HTTP_RESPONSE_CODE_SUCCESS, "", data);
    }

    /**
     * 获取错返回结果(无参数替换)
     *
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
     *
     * @param errorCode
     * @param params
     * @return
     */
    public ResponseObject getFailureResult(int errorCode, String... params) {
//        return new ResponseObject(errorCode, PropertiesUtil.getResponseErrorMessageByCode(errorCode, params), null);
        String msg = messageSource.getMessage("response.error." + errorCode, params, Locale.getDefault());
        return new ResponseObject(errorCode, msg, null);
    }

    public Object getFromSession(String key, HttpServletRequest request) {
        return request.getSession().getAttribute(key);
    }

    public void setSession(String key, Object object, HttpServletRequest request) {
        request.getSession().setAttribute(key, object);
    }

    public void removeSession(String key, HttpServletRequest request) {
        request.getSession().removeAttribute(key);
    }

    protected static Map<String, Object> getRequestMap(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        Map<String, String[]> map2 = request.getParameterMap();

        for (Map.Entry<String, String[]> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue()[0]);
        }
        return map;
    }

}