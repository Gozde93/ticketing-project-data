package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO fundByUsername(String username);

    void save(UserDTO user);
    void deleteByUserName(String username);




}
