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
    public AppUser save(AppUser appUser) {
        appUserRepository.save(appUser);
        return appUser;
    }
    public void delete(AppUser appUser) {
        appUserRepository.delete(appUser);
    }

    public AppUser getFirstName(String firstName) {
        return appUserRepository.findByFirstName(firstName).orElse(null);
    }
    public AppUser getUserByEmail(String email) {
        return appUserRepository.findByEmail(email).orElse(null);
    }
    public AppUser getUserByPassword(String password) {
        return appUserRepository.findByPassword(password).orElse(null);
    }
}
