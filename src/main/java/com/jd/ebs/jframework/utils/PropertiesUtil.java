package com.jd.ebs.jframework.utils;

import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by jinlong.hao on 16/5/20.
 */
public class PropertiesUtil {

    public static final ResourceBundle messageResource = ResourceBundle.getBundle("i18n.message", Locale.US);

    /**
     * 获取请求返回Code对应的Message
     * @param code
     * @param params
     * @return
     */
    public static String getResponseErrorMessageByCode(int code, String...params) {
        String pStr = messageResource.getString("response.error." + code);
        if(StringUtils.isEmpty(pStr)) return "";
        if(params == null || params.length == 0) return pStr;
        MessageFormat format = new MessageFormat(pStr, Locale.getDefault());
        return format.format(params);
    }

    /**
     * 根据Key值获取Value
     * @param key
     * @param params
     * @return
     */
    public static String getValueByKey(String key, String...params) {
        String pStr = messageResource.getString(key);
        if(StringUtils.isEmpty(pStr)) return "";
        if(params == null || params.length == 0) return pStr;
        MessageFormat format = new MessageFormat(pStr, Locale.getDefault());
        return format.format(params);
    }

}
