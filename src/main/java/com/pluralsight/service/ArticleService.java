package com.pluralsight.service;

import com.pluralsight.model.Article;

import java.util.List;

public interface ArticleService {

    void addArticle(final Article article);

    List<Article> getAllArticles();

    Article getArticleByName(String name);

//    void removeArticle(final String articleName);

}
