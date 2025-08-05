package com.tevyt.code_pulse_api.github;

import aj.org.objectweb.asm.TypeReference;
import com.tevyt.code_pulse_api.github.api.getRepositories.Repository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

@Service
@CommonsLog
public class GithubService {

    private final RestTemplate restTemplate;


    public GithubService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Repository> getRepositories(String githubAccessToken) throws Exception {
        final String listRepositoriesURL = "https://api.github.com/user/repos";

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, "application/vnd.github+json");
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + githubAccessToken);
        headers.add("X-GitHub-Api-Version", "2022-11-28");

        var requestEntity = new HttpEntity<>(headers);

        log.info("Fetching github repositories");
        ResponseEntity<List<Repository>> responseEntity =  restTemplate.exchange(listRepositoriesURL, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<List<Repository>>(){});

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            log.info("Successfully retrieved github repositories");
            return  responseEntity.getBody();
        }else{
            log.error("Failed to retrieve github repositories");
            throw new Exception("Unable to list repositories: " + responseEntity.getStatusCode());
        }

    }
}
