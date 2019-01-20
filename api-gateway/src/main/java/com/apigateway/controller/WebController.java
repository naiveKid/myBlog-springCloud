package com.apigateway.controller;

import com.apigateway.service.AboutMeService;
import com.model.AboutMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 网站
 */
@Controller
@RequestMapping("/web")
public class WebController {
    @Autowired
    AboutMeService aboutMeService;


    /**
     * 网站首页
     *
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String homePage(Model model) {
        return "index";
    }

    /**
     * 关于我
     *
     * @param model
     * @return
     */
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        AboutMe me = aboutMeService.getAboutMe();
        model.addAttribute("me", me);
        return "about";
    }

    /**
     * 留言
     *
     * @param model
     * @return
     */
    @RequestMapping("/gbook")
    public String gbookPage(Model model) {
        return "gbook";
    }

    /**
     * 日记详情页
     *
     * @param model
     * @return
     */
    @RequestMapping("/info")
    public String infoPage(Model model) {
        return "info";
    }

    /**
     * 相册详情页
     *
     * @param model
     * @return
     */
    @RequestMapping("/infopic")
    public String infopicPage(Model model) {
        return "infopic";
    }

    /**
     * 我的日记
     *
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String listPage(Model model) {
        return "list";
    }

    /**
     * 我的相册
     *
     * @param model
     * @return
     */
    @RequestMapping("/share")
    public String sharePage(Model model) {
        return "share";
    }
}