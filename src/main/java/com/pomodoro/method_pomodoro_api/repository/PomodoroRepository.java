package com.pomodoro.method_pomodoro_api.repository;

import com.pomodoro.method_pomodoro_api.entities.Pomodoro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PomodoroRepository extends JpaRepository<Pomodoro, Long> {
}
