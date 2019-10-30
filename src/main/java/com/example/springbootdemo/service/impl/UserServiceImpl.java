package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.dto.UserDto;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public List<User> allUserList(){
        return userMapper.userList();
    }
    public int addUser(UserDto userDto){
        return userMapper.add(userDto);
    }
    public int updateUser(User user){
        return userMapper.update(user);
    }

    public int deleteUser(String userId){
        return userMapper.delete(userId);
    }

    public User findUserById(String userId){
        return userMapper.findUserById(userId);
    }

}
