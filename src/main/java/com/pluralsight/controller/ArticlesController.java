package com.pluralsight.controller;

import com.pluralsight.model.Article;
import com.pluralsight.model.EmptyArticle;
import com.pluralsight.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticlesController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "articles", method = RequestMethod.GET)
    public String articles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "articles";
    }

    @RequestMapping(value = "articles/{name}", method = RequestMethod.GET)
    public String specialArticle(Model model, @PathVariable("name") String name) {
        Article article = articleService.getArticleByName(name);
        if (article instanceof EmptyArticle) {
            model.addAttribute("emptyArticle", article);
            return "noArticle";
        }
        model.addAttribute("article", article);
        return "article";
    }

}
