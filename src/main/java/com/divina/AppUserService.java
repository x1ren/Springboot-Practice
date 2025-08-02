package com.divina;

import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }


    public void save(AppUser appUser) {
        appUserRepository.save(appUser);
    }
}
