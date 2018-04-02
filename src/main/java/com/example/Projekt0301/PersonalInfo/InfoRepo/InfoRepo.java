package com.example.Projekt0301.PersonalInfo.InfoRepo;

import com.example.Projekt0301.PersonalInfo.InfoModel.InfoModel;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
@EnableJpaRepositories("com.example.Projekt0301.Jobs.jobRepo")
public interface InfoRepo extends CrudRepository <InfoModel, Integer> {
    List<InfoModel> findAllBy();
}
