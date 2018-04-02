package com.example.Projekt0301.Users.Controller;

import com.example.Projekt0301.Users.Model.UserModel;
import com.example.Projekt0301.Users.Repo.UserRepository;
import com.example.Projekt0301.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:8000")
@RestController
public class UserController {

    @Autowired
    UserService service;
    UserRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "/create/get")
    public @ResponseBody
    List<UserModel> Users() throws Exception {
        service.listadd();
       return  service.list();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public @ResponseBody
    List<UserModel> UserCreate() throws Exception {

        return service.list();
    }


}
