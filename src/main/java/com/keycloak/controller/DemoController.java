package com.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class DemoController {

    String[] homeArray = {"home", "welcome_home"};

    String[] adminArray = {"admin", "welcome Admin"};

    String[] userArray = {"user", "welcome User"};

    String[] userAndAdminArray = {"userAndAdmin", "welcome UserAndAdmin"};

    @GetMapping
    public String[] home() {
        return homeArray;
    }

    @GetMapping("/user")
    public String[] user() {
        return userArray;
    }

    @GetMapping("/admin")
    public String[] admin() {
        return userAndAdminArray;
    }

    @GetMapping("/admin_user")
    public String[] adminAndUser() {
        return userAndAdminArray;
    }
}
