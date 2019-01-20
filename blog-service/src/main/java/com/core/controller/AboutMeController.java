package com.core.controller;

import com.core.service.AboutMeService;
import com.model.AboutMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:关于我
 */
@RestController
@RequestMapping("/aboutMe")
public class AboutMeController {
    @Autowired
    AboutMeService aboutMeService;

    /**
     * 关于我的相关信息
     * @return
     */
    @RequestMapping("/index")
    public AboutMe index(){
        return aboutMeService.getAboutMe();
    }
}