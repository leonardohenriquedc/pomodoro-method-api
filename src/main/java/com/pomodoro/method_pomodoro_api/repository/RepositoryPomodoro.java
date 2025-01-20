package com.pomodoro.method_pomodoro_api.repository;

import com.pomodoro.method_pomodoro_api.entities.Pomodoro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface RepositoryPomodoro extends JpaRepository<Pomodoro, Long> {
}
