package com.fundamentosplatzi.springboot.fundamentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "post")
@NoArgsConstructor
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion; 

    @ManyToOne
    private User user;

    public Post(String descripcion, User user) {
        this.descripcion = descripcion;
        this.user = user;
    }

    
}
