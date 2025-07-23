package org.example.wechat.dto;

import lombok.Data;

@Data
public class RegisterDTO {
    private String phone;
    private String code;
    private String password;
}
