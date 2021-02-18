package com.example.camp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {

    Optional<User> findByFirstName(String firstname);

    Optional<User> findByLastName(String lastname);

    Optional<User> findByEmail(String email);
}
