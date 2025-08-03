package com.divina;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final AppUserService appUserService;

    public UserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return appUserService.getAllUsers();
    }
    @PostMapping
    public AppUser createUser(@RequestBody AppUser appUser) {
        return appUserService.save(appUser);
    }
    @GetMapping("/search")
    public List<AppUser> searchByFirstName(@RequestParam String firstName) {
        return appUserService.getFirstName(firstName);
    }

}
