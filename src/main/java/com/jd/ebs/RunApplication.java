package com.jd.ebs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring boot运行类
 * @author 郝金龙 haojinlong@jd.com
 * @version 1.0
 * @date 2017/12/1
 */
@SpringBootApplication
public class RunApplication extends SpringBootServletInitializer {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(RunApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

}
