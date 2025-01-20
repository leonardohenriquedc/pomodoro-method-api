package com.pomodoro.method_pomodoro_api.service;

import com.pomodoro.method_pomodoro_api.dto.UserDTO;
import com.pomodoro.method_pomodoro_api.entities.User;
import com.pomodoro.method_pomodoro_api.repository.RepositoryPomodoro;
import com.pomodoro.method_pomodoro_api.repository.RepositoryUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Searches {

    @Autowired
    RepositoryPomodoro repositoryPomodoro;

    @Autowired
    RepositoryUsers repositoryUsers;

    public UserDTO findByIdUser(Long id){

        Optional<User> result = repositoryUsers.findById(id);

        if(result.isPresent()){

            return new UserDTO(result.get());
        }else{

            throw new RuntimeException("Recurso não encontrado");
        }
    }

    public Page<UserDTO> findAllUsers(Pageable pageable){

        Page<User> result = repositoryUsers.findAll(pageable);

        return result.map(u -> new UserDTO(u));
    }
}
