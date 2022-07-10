package com.fundamentosplatzi.springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanTwoImplement;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean myBean() {
        return new MyBeanTwoImplement();
    }
}
