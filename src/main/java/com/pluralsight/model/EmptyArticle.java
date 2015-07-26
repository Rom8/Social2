package com.pluralsight.model;

public class EmptyArticle extends Article {

    private String name;

    public EmptyArticle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
