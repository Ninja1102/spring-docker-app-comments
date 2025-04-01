package com.ust.spring_docker_app_comments.service;

import com.ust.spring_docker_app_comments.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> getAllComments() {
        Comment[] comments = restTemplate.getForObject(URL, Comment[].class);
        return Arrays.asList(comments);
    }
}

