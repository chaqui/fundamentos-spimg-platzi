package com.fundamentosplatzi.springboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Data;

@ConstructorBinding
@ConfigurationProperties(prefix = "user")
@Data
public class UserPojo {
    private String email;
    private String password;
    private String age;    
}
