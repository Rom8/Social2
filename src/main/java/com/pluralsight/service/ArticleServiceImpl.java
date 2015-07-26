package com.pluralsight.service;

import com.pluralsight.model.Article;
import com.pluralsight.repository.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private StorageService storageService;

    @Override
    public void addArticle(Article article) {
        storageService.addArticle(article);
    }

    @Override
    public List<Article> getAllArticles() {
        return storageService.getAllArticles();
    }

    @Override
    public Article getArticleByName(String name) {
        return storageService.getArticleByName(name);
    }
}
