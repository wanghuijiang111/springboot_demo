package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.UserDto;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 返回主页，查询记录
     * @return
     */
    @RequestMapping(value = "/")
    public String returnIndex(){
        return "redirect:/list";
    }
    @RequestMapping(value = "/list")
    public String hello(Model model){
        List<User> all =userService.allUserList();
        model.addAttribute("all", all);
        return "index";
    }


    /**
     * add
     */
    @RequestMapping(value = "/toAdd")
    public String toAdd(){ return "add"; }
    @RequestMapping(value = "/add")
    public String add(UserDto userDto){
        userService.addUser(userDto);
        return "redirect:/list";
    }
    /**
     * update
     */
    @RequestMapping(value = "/edit/{userId}")
    public String edituser(@PathVariable String userId,Model model){
        User user =userService.findUserById(userId);
        model.addAttribute("user", user);
        return "edit";
    }
    @RequestMapping(value = "/save")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/list";
    }
    /**
     * delete
     */
    @RequestMapping(value = "/del/{userId}")
    public String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "redirect:/list";
    }

}
