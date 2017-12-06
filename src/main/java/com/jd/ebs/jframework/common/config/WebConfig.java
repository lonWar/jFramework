package com.jd.ebs.jframework.common.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring boot 配置类
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/1
 */
@Configuration
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@EnableAsync
@EnableCaching
@EnableScheduling
@EnableTransactionManagement
@ImportResource("classpath:jsf-consumer.xml")
public class WebConfig {
}
