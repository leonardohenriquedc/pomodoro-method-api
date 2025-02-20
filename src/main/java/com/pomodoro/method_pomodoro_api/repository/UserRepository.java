package com.pomodoro.method_pomodoro_api.repository;

import com.pomodoro.method_pomodoro_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
