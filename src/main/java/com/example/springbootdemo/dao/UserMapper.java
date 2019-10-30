package com.example.springbootdemo.dao;

import com.example.springbootdemo.dto.UserDto;
import com.example.springbootdemo.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> userList();
    public int add(UserDto userDto);
    public int update(User user);
    public int delete(String userId);
    public User findUserById(String userId);
}