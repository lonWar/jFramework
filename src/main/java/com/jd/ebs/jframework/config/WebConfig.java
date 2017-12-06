package com.jd.ebs.jframework.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring boot 配置类
 *
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
@ComponentScan({"com.jd.ebs"})
public class WebConfig {

    @Bean("messageSource")
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("i18n/message");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

}
