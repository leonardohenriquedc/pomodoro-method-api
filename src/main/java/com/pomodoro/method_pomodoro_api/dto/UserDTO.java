package com.pomodoro.method_pomodoro_api.dto;

import com.pomodoro.method_pomodoro_api.entities.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;

    @NotBlank(message = "Campo não pode ser vazio")
    private String name;

    @NotBlank(message = "Campo não pode ser vazio")
    private String password;

    private List<PomodoroDTO> pomdoroDTOS = new ArrayList<>();

    public UserDTO(Long id, String name, String password, List<PomodoroDTO> pomdoroDTOS) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.pomdoroDTOS = pomdoroDTOS;
    }

    public UserDTO(User user){
        this.id = user.getId();

        this.name = user.getName();

        this.password = user.getPassword();
    }

    public UserDTO(){
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", pomdoroDTOS=" + pomdoroDTOS +
                '}';
    }
}
