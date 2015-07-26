package com.pluralsight.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Article {

    public static final String COMMAND = "newArticle";

    private List<String> contentBlocks;

    private String name;

    public Article() {
        contentBlocks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContentBlocks() {
        return contentBlocks;
    }

    public void setContentBlocks(List<String> contentBlocks) {
        this.contentBlocks = contentBlocks;
    }

}
