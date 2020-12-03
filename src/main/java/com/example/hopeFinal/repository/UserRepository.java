package com.example.hopeFinal.repository;

import com.example.hopeFinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
