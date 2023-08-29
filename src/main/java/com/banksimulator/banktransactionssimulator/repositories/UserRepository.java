package com.banksimulator.banktransactionssimulator.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banksimulator.banktransactionssimulator.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String Document);

    Optional<User> findUserById(Long id);
}
