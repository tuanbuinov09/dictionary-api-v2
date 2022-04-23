package com.example.demo.controllers.entities;

import javax.persistence.*;

@Entity
@Table(name = "example")
public class Example {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "meaning")
    private Meaning meaning;
    private Example example;
    private String exampleMeaning;
}
