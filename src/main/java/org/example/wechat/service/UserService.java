package org.example.wechat.service;

import org.example.wechat.domain.User;
import org.example.wechat.dto.RegisterDTO;
import org.example.wechat.repository.UserRepository;
import org.example.wechat.utils.JwtUtil;
import org.example.wechat.dto.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SmsService smsService;
    @Autowired
    private JwtUtil jwtUtil;

    public UserVO register(RegisterDTO dto) {
        if (!smsService.verifyCode(dto.getPhone(), dto.getCode())) {
            throw new RuntimeException("验证码错误");
        }
        if (userRepository.findByPhone(dto.getPhone()) != null) {
            throw new RuntimeException("手机号已注册");
        }
        User user = new User();
        user.setPhone(dto.getPhone());
        user.setPassword(dto.getPassword()); // 实际项目应加密
        userRepository.save(user);

        UserVO vo = new UserVO();
        vo.setId(user.getId());
        vo.setPhone(user.getPhone());
        vo.setToken(jwtUtil.generateToken(user.getPhone()));
        return vo;
    }
} 