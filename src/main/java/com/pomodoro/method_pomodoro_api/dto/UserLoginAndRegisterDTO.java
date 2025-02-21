package com.pomodoro.method_pomodoro_api.dto;

import jakarta.validation.constraints.NotBlank;

public class UserLoginAndRegisterDTO {

    private Long id;

    @NotBlank(message = "Campo não pode ser vazio")
    private String name;

    @NotBlank(message = "Campo não pode ser vazio")
    private String password;

    public UserLoginAndRegisterDTO(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserLoginAndRegisterDTO() {
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

    @Override
    public String toString() {
        return "UserLoginAndRegisterDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
