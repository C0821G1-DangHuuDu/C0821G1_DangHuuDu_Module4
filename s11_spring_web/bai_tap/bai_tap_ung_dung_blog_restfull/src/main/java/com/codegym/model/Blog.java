package com.codegym.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Blog {
    @Id
    @Column (name = "id")
    private Integer id;
    @Column (name = "name")
    private String name;
    @Column (name = "content")
    private String content;
    @Column (name = "note")
    private String note;

    public Blog() {
    }

    public Blog(Integer id, String name, String content, String note) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
