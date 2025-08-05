package com.tevyt.code_pulse_api.user;

import com.zaxxer.hikari.util.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(CreateUserDTO createUserDTO) {
        var userEntity = new UserEntity();
        userEntity.setUsername(createUserDTO.getUsername());
        userEntity.setGithubAccessToken(createUserDTO.getGithubAccessToken());

        return userRepository.save(userEntity);
    }

    public Optional<UserEntity> getUser(long userId){
        return userRepository.findById(userId);
    }
}
