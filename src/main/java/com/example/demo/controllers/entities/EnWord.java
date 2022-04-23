package com.example.demo.controllers.entities;

import javax.persistence.*;

@Entity
@Table(name = "en_word")
public class EnWord {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "word")
    private String word;
    @Column(name = "views")
    private int views;
    @Column(name = "pronunciation")
    private String pronunciation;

    public EnWord() {
    }

    public EnWord(int id, String word, int views, String pronunciation) {
        this.id = id;
        this.word = word;
        this.views = views;
        this.pronunciation = pronunciation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }
}
