package com.users.services;

import com.users.dtos.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findALl();
    UserDTO findById(Long id);
}
