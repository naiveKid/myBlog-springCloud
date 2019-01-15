package com.core.service;

import com.core.dao.AboutMeMapper;
import com.model.AboutMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 */
@Service
public class AboutMeService {

    @Autowired
    AboutMeMapper aboutMeMapper;


    public AboutMe getAboutMe() {
        return aboutMeMapper.selectByPrimaryKey(1);
    }
}