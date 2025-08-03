package com.divina;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }
    public void save(AppUser appUser) {
        appUserRepository.save(appUser);
    }
    public void delete(AppUser appUser) {
        appUserRepository.delete(appUser);
    }
    public AppUser getUserByUsername(String firstName) {
        return appUserRepository.findByFirstName(firstName).orElse(null);
    }
}
