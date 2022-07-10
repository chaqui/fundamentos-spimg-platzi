package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean {

    @Override
    public void saludar() {
        System.out.println("Hola desde el segundo bean");
    }

}