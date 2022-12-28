package com.appsdeveloperblog.app.ws.mobileappws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaRepositories
public class MobileAppWsApplication{

    public static void main(String[] args){
        SpringApplication.run(MobileAppWsApplication.class,args);
    }

}
