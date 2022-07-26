package com.fundamentosplatzi.springboot.fundamentos.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithPropierties;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithPropiertiesImplement;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;

@Configuration
@PropertySource("classpath:connection.properties")
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Value("${jdbc.url}")
    private String jdbcUrl;
    
    @Value("${username}")
    private String username;
    
    @Value("${password}")
    private String password;
   
    @Value("${dialecto}")
    private String dialecto;
   
    @Value("${driver}")
    private String driver;

    @Bean
    public MyBeanWithPropierties getMyBeanWithPropierties() {
        return new MyBeanWithPropiertiesImplement(name, apellido);
    }

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driver);
        dataSourceBuilder.url(jdbcUrl);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }
}
