package com.woowahan.myticket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by junyoung on 2016. 4. 21..
 */
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {
    static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        logger.info("[start] application");
    }

}
