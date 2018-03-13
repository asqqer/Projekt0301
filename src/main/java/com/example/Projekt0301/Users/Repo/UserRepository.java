package com.example.Projekt0301.Users.Repo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.Projekt0301.Users.Model.UserModel;
import java.util.List;

@Transactional
@Repository
@EnableJpaRepositories("com.example.Projekt0301.Users.Repo.UserRepo")
public interface UserRepository extends CrudRepository<UserModel, Integer>{

    //List<UserModel> findAll();


}
