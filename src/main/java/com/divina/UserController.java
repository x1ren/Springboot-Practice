package com.divina;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {


    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(
                        15,
                        "iben",
                        "anoos",
                        "iben@gmail.com",
                        "123123"

                ),
                new User(
                        18,
                        "her",
                        "wtf",
                        "iben@gmail.com",
                        "123123"

                )
        );
    }
}
