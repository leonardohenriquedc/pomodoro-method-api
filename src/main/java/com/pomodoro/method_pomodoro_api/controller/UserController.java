package com.pomodoro.method_pomodoro_api.controller;

import com.pomodoro.method_pomodoro_api.dto.UserDTO;
import com.pomodoro.method_pomodoro_api.dto.UserLoginAndRegisterDTO;
import com.pomodoro.method_pomodoro_api.entities.User;
import com.pomodoro.method_pomodoro_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/create")
    public ResponseEntity<UserDTO> create(@RequestBody UserLoginAndRegisterDTO dto){

        UserDTO result = userService.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(result);
    }


}
