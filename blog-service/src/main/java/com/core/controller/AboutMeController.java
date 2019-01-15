package com.core.controller;

import com.core.service.AboutMeService;
import com.model.AboutMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 */
@RestController
@RequestMapping("/aboutMe")
public class AboutMeController {
    @Autowired
    AboutMeService aboutMeService;


    @RequestMapping("/index")
    public AboutMe index(){
        return aboutMeService.getAboutMe();
    }
}