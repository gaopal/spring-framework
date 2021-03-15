package com.gaopal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.gaopal.selftag")
public class MyComponentScan {

    @ComponentScan("com.gaopal.selftag")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
