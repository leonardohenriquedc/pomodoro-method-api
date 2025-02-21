package com.pomodoro.method_pomodoro_api.service;

import com.pomodoro.method_pomodoro_api.dto.UserDTO;
import com.pomodoro.method_pomodoro_api.dto.UserLoginAndRegisterDTO;
import com.pomodoro.method_pomodoro_api.entities.User;
import com.pomodoro.method_pomodoro_api.exceptions.ResourceNotFound;
import com.pomodoro.method_pomodoro_api.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO insert (UserLoginAndRegisterDTO dto){
        User user = new User();

        copyDtoToUser(user, dto);

        System.out.println("DTO: " + dto.toString());

        System.out.println("Entity: " + user.toString());

        user = userRepository.save(user);

        return new UserDTO(user);
    }

    public UserDTO update(Long id, UserDTO dto){

        try {
            User user = userRepository.getReferenceById(id);

            copyDtoToUser(user, dto);

            user = userRepository.save(user);

            return new UserDTO(user);

        }catch (EntityNotFoundException ex){

            throw new ResourceNotFound("Recurso não encontrado ");
        }
    }

    public void delete(Long id){

        User user = userRepository.getReferenceById(id);

        userRepository.delete(user);
    }

    private User copyDtoToUser(User user, UserLoginAndRegisterDTO dto){

        user.setName(dto.getName());

        user.setPassword(dto.getPassword());

        return user;
    }

    private User copyDtoToUser(User user, UserDTO dto){

        user.setName(dto.getName());

        user.setPassword(dto.getPassword());

        return user;
    }
}
