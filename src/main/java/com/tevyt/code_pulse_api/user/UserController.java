package com.tevyt.code_pulse_api.user;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@CommonsLog
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody CreateUserDTO createUserDTO) {

        UserEntity userEntity = userService.createUser(createUserDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/users/" + userEntity.getId());
        log.info("User created: " + createUserDTO.getUsername());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
