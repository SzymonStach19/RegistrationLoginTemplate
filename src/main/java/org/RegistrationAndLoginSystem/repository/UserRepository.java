package org.RegistrationAndLoginSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.RegistrationAndLoginSystem.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
