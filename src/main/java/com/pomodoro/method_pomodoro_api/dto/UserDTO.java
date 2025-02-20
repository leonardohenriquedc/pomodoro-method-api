package com.pomodoro.method_pomodoro_api.dto;

import com.pomodoro.method_pomodoro_api.entities.User;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;

    private String name;

    private List<PomodoroDTO> pomdoroDTOS = new ArrayList<>();

    public UserDTO(Long id, String name, List<PomodoroDTO> pomdoroDTOS) {
        this.id = id;
        this.name = name;
        this.pomdoroDTOS = pomdoroDTOS;
    }

    public UserDTO(User user){
        this.id = user.getId();

        this.name = user.getName();
    }

    public UserDTO(){
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

    public List<PomodoroDTO> getPomdoroDTOS() {
        return pomdoroDTOS;
    }

    public void setPomdoroDTOS(List<PomodoroDTO> pomdoroDTOS) {
        this.pomdoroDTOS = pomdoroDTOS;
    }
}
