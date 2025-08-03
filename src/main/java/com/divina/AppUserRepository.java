package com.divina;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByFirstName(String firstName);
    Optional<AppUser> findByLastName(String lastName);
    Optional<AppUser> findByEmail(String email);
    Optional<AppUser> findByPassword(String password);
}
