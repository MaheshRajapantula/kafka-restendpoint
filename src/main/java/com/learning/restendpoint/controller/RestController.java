package com.learning.restendpoint.controller;

import com.learning.restendpoint.model.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @ResponseStatus
    @GetMapping("/getUser")
    public ResponseEntity<User> sendUser() {
        return new ResponseEntity<>(new User("Mahesh", "007", "75000"), HttpStatus.OK);
    }
}
