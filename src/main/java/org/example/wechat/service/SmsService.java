package org.example.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SmsService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public String sendCode(String phone) {
        String code = String.valueOf((int)((Math.random()*9+1)*100000));
        redisTemplate.opsForValue().set("sms:code:" + phone, code, 5, TimeUnit.MINUTES);
        // 实际项目应调用短信平台，这里直接返回
        return code;
    }

    public boolean verifyCode(String phone, String code) {
        String realCode = redisTemplate.opsForValue().get("sms:code:" + phone);
        return code.equals(realCode);
    }
} 