package com.apigateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 网站首页
 */
@Controller
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/index")
    public String homePage(Model model) {
        return "index";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }

    @RequestMapping("/gbook")
    public String gbookPage(Model model) {
        return "gbook";
    }

    @RequestMapping("/info")
    public String infoPage(Model model) {
        return "info";
    }

    @RequestMapping("/infopic")
    public String infopicPage(Model model) {
        return "infopic";
    }

    @RequestMapping("/list")
    public String listPage(Model model) {
        return "list";
    }

    @RequestMapping("/share")
    public String sharePage(Model model) {
        return "share";
    }
}