package com.tevyt.code_pulse_api.github;

import com.tevyt.code_pulse_api.github.api.getRepositories.Repository;
import com.tevyt.code_pulse_api.user.UserEntity;
import com.tevyt.code_pulse_api.user.UserService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/github")
@CommonsLog
public class GithubController {

    private final GithubService githubService;
    private final UserService userService;

    @Autowired
    public GithubController(GithubService githubService, UserService userService) {
        this.githubService = githubService;
        this.userService = userService;
    }

    @GetMapping("/repositories/{userId}")
    public ResponseEntity<List<String>> getRepositories(@PathVariable("userId") long userId){
        log.info("Fetching repositories for user: " + userId);
        Optional<UserEntity> userEntityOptional = userService.getUser(userId);

        if(userEntityOptional.isPresent()){
            var user = userEntityOptional.get();
            try {
                List<Repository> repositories = githubService.getRepositories(user.getGithubAccessToken());
                var repositoryNames = repositories.stream()
                        .map(Repository::getName)
                        .toList();

                return new ResponseEntity<>(repositoryNames, HttpStatus.OK);
            } catch (Exception e) {
                log.error(e.getMessage());
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
