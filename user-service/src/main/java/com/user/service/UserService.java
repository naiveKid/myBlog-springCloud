package com.user.service;

import com.google.common.collect.ImmutableMap;
import com.model.User;
import com.user.util.JwtHelper;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Map;

/**
 * @Description: 用户服务
 */
@Service
public class UserService {

    /**
     * 生成token
     *
     * @param user
     * @return
     */
    public String login(User user) {
        return JwtHelper.genToken(ImmutableMap.of("name", user.getLoginName(), "ts", Instant.now().getEpochSecond() + ""));
    }

    /**
     * 验证token是否有效
     *
     * @param token
     * @return
     */
    public boolean verifyToken(String token) {
        Map<String, String> map;
        try {
            map = JwtHelper.verifyToken(token);
        } catch (RuntimeException e) {
            return false;
        }
        if (map != null && map.get("name") != null) {
            return true;
        }
        return false;
    }
}