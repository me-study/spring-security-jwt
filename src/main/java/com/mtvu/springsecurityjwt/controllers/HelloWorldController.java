package com.mtvu.springsecurityjwt.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @RequestMapping({"/user"})
    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public String userPage() {
        return "Hello User";
    }

    @RequestMapping({"/admin"})
    @Secured({"ROLE_ADMIN"})
    public String adminPage() {
        return "Hello Admin";
    }
}
