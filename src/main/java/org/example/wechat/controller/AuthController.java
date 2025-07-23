package org.example.wechat.controller;

import org.example.wechat.dto.RegisterDTO;
import org.example.wechat.service.SmsService;
import org.example.wechat.service.UserService;
import org.example.wechat.dto.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private SmsService smsService;
    @Autowired
    private UserService userService;

    @PostMapping("/sendCode")
    public String sendCode(@RequestParam String phone) {
        String code = smsService.sendCode(phone);
        return "验证码：" + code; // 实际项目不返回code
    }

    @PostMapping("/register")
    public UserVO register(@RequestBody RegisterDTO dto) {
        return userService.register(dto);
    }
} 