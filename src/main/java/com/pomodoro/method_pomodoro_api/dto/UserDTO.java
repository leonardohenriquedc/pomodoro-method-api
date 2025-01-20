package com.pomodoro.method_pomodoro_api.dto;

import com.pomodoro.method_pomodoro_api.entities.Pomodoro;
import com.pomodoro.method_pomodoro_api.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private List<Pomodoro> pomodoroConfigured = new ArrayList<>();

    public UserDTO(Long id, String name, String email, List<Pomodoro> pomodoroConfigured) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pomodoroConfigured = pomodoroConfigured;
    }

    public UserDTO(){
    }

    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.pomodoroConfigured = user.getPomodoroConfigured();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pomodoro> getPomodoroConfigured() {
        return pomodoroConfigured;
    }

    public void setPomodoroConfigured(List<Pomodoro> pomodoroConfigured) {
        this.pomodoroConfigured = pomodoroConfigured;
    }
}
