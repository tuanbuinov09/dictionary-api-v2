package com.example.demo.controllers.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "part_of_speech")
public class PartOfSpeech {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "part_of_speech", fetch = FetchType.LAZY, orphanRemoval = false, cascade = CascadeType.ALL)
    private List partOfSpeechList;

    public PartOfSpeech(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getPartOfSpeechList() {
        return partOfSpeechList;
    }
}
