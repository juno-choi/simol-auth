package com.simol.auth.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
@Slf4j
public class AuthController {
    @PostMapping("")
    public String auth() {
        log.info("auth 인증 처리...");
        return "auth";
    }
}
