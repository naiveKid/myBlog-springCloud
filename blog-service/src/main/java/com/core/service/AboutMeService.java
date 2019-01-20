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

    /**
     * 关于我的相关信息
     *
     * @return
     */
    public AboutMe getAboutMe() {
        return aboutMeMapper.selectByPrimaryKey(1);
    }
}