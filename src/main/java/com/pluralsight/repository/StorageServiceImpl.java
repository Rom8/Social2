package com.pluralsight.repository;

import com.pluralsight.model.Article;
import com.pluralsight.model.EmptyArticle;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.repository.Storage.articles;

@Repository
public class StorageServiceImpl implements StorageService {

    @Override
    public void addArticle(Article article) {
        articles.add(article);
    }

    @Override
    public List<Article> getAllArticles() {
        return new ArrayList<>(articles);
    }

    @Override
    public Article getArticleByName(String name) {
        for (Article article: articles) {
            if (StringUtils.equals(name, article.getName())) {
                return article;
            }
        }
        return new EmptyArticle(name);
    }
}
