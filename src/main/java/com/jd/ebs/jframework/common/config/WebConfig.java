package com.jd.ebs.jframework.common.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.annotation.MultipartConfig;

/**
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/1
 */
@Configuration
@EnableCaching
@EnableAspectJAutoProxy
@EnableAsync
@EnableScheduling
@MultipartConfig(location = "org.springframework.web.multipart.commons.CommonsMultipartResolver", maxFileSize = 10240)
public class WebConfig {
}
