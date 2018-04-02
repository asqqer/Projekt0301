package com.example.Projekt0301.Users.Service;

import com.example.Projekt0301.Users.Model.UserModel;
import com.example.Projekt0301.Users.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<UserModel> list(){
        return (List<UserModel>) repo.findAll();
    }
    public void listadd(){
        repo.save(new UserModel("Asger","block"));

    }
}
