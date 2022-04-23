package com.example.demo.controllers.entities;

import javax.persistence.*;

@Entity
@Table(name = "meaning")
public class Meaning {
    @Id
    @Column(name = "meaning")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "en_word_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private EnWord enWord;
    @Column(name = "part_of_speech_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    private PartOfSpeech partOfSpeech;
    @Column(name = "meaning")
    private String meaning;

    public Meaning(int id, EnWord enWord, PartOfSpeech partOfSpeech, String meaning) {
        this.id = id;
        this.enWord = enWord;
        this.partOfSpeech = partOfSpeech;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnWord getEnWord() {
        return enWord;
    }

    public void setEnWord(EnWord enWord) {
        this.enWord = enWord;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
