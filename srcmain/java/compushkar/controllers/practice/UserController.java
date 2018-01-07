package com.pushkar.controllers.practice;

import com.pushkar.models.practice.User;
import com.pushkar.services.practice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public @ResponseBody String registration(@RequestBody User user){
        int i=userService.resgistration(user);
        if(i>0){
            return "successfully registered";
        }else{
            return "not registered";
        }

    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUsers(){

        return userService.getUsers();
    }
}
