package com.pomodoro.method_pomodoro_api.service;

import com.pomodoro.method_pomodoro_api.dto.UserDTO;
import com.pomodoro.method_pomodoro_api.entities.User;
import com.pomodoro.method_pomodoro_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO insert (UserDTO dto){
        User user = new User();

        copyDtoToUser(user, dto);

        user = userRepository.save(user);

        return new UserDTO(user);
    }

    public UserDTO update(Long id, UserDTO dto){

        User user = userRepository.getReferenceById(id);

        copyDtoToUser(user, dto);

        user = userRepository.save(user);

        return new UserDTO(user);
    }

    private User copyDtoToUser(User user, UserDTO dto){

        user.setName(dto.getName());

        return user;
    }
}
