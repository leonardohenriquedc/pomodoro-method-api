package com.pomodoro.method_pomodoro_api.service;

import com.pomodoro.method_pomodoro_api.dto.PomodoroDTO;
import com.pomodoro.method_pomodoro_api.dto.UserDTO;
import com.pomodoro.method_pomodoro_api.entities.Pomodoro;
import com.pomodoro.method_pomodoro_api.entities.User;
import com.pomodoro.method_pomodoro_api.repository.RepositoryPomodoro;
import com.pomodoro.method_pomodoro_api.repository.RepositoryUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class createdies {

    @Autowired
    RepositoryUsers repositoryUsers;

    @Autowired
    RepositoryPomodoro repositoryPomodoro;

    public UserDTO creatingUser(UserDTO dto){

        User user = copyUserDtoToUser(dto, new User());

        user = repositoryUsers.save(user);

        return new UserDTO(user);

    }

    public PomodoroDTO creatingPomodoro (PomodoroDTO pomodoroDTO){

        Pomodoro pomodoro = copyPomodoroDtoToPomodoro(pomodoroDTO, new Pomodoro());

        pomodoro = repositoryPomodoro.save(pomodoro);

        return new PomodoroDTO(pomodoro);
    }

    private static User copyUserDtoToUser(UserDTO userDto, User user){

        user.setName(userDto.getName());

        user.setEmail(userDto.getEmail());

        return user;
    }

    private static Pomodoro copyPomodoroDtoToPomodoro(PomodoroDTO pomodoroDTO, Pomodoro pomodoro){

        pomodoro.setMinutesOfStudy(pomodoroDTO.getMinutesOfStudy());

        pomodoro.setMinutesOfInterval(pomodoroDTO.getMinutesOfInterval());

        pomodoro.setUser(pomodoroDTO.getUser());

        return pomodoro;
    }
}