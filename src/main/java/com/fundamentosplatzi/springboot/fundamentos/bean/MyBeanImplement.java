package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {

    @Override
    public void saludar() {
        System.out.println("Hola desde un bean");
    }

}
