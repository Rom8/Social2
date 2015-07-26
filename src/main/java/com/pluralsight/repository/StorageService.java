package com.pluralsight.repository;

import com.pluralsight.model.Article;

import java.util.List;

public interface StorageService {

    void addArticle(final Article article);

    List<Article> getAllArticles();

    Article getArticleByName(String name);
}
