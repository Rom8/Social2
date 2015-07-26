package com.pluralsight.controller;

import com.pluralsight.model.Article;
import com.pluralsight.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import static com.pluralsight.utils.Helper.*;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "addArticle", method = RequestMethod.GET)
    public String addArticle(Model model) {
        Article article = new Article();
        model.addAttribute(Article.COMMAND, article);
        return "addArticle";
    }

    @RequestMapping(value = "addArticle", method = RequestMethod.POST)
    public String article(@ModelAttribute(Article.COMMAND) Article article) {
        articleService.addArticle(article);
        return redirect("articles");
    }

}
