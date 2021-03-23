package com.sbs.mobilebank.controllers;

import com.sbs.mobilebank.entities.UserEntity;
import com.sbs.mobilebank.service.UserService;
import com.sbs.mobilebank.shared.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author djaitai
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String getAllUser(Model model){
        UserDTO userDTO = new UserDTO();
        List<UserEntity> userList = userService.getAllUsers();
        model.addAttribute("userDTO", userDTO);
        model.addAttribute("userList",userList);
        return "user";
    }

}
