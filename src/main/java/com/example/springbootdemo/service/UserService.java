package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.UserDto;
import com.example.springbootdemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUserList();

    public int addUser(UserDto userDto);

    public int updateUser(User user);

    public int deleteUser(String userId);

    public User findUserById(String userId);
}
