package com.tevyt.code_pulse_api.user;

import lombok.Data;

@Data
public class CreateUserDTO {
    private String username;
    private String githubAccessToken;
}
