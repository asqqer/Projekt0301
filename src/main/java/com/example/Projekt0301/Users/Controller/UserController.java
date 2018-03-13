package com.example.Projekt0301.Users.Controller;

import com.example.Projekt0301.Users.Model.UserModel;
import com.example.Projekt0301.Users.Repo.UserRepository;
import com.example.Projekt0301.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    //@CrossOrigin(origins = "http://localhost:8000")
    @RequestMapping(method = RequestMethod.GET, value = "/movies")
    public @ResponseBody
    List<UserModel> movies() throws Exception {
        service.list();
       return  null;
    }



}
