package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropiertiesImplement implements MyBeanWithPropierties {

    private String nombre;
    private String apellido;
    

    public MyBeanWithPropiertiesImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String getCadena() {
        return nombre + " " + apellido;
    }
    
}
