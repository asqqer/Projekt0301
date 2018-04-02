package com.example.Projekt0301.Jobs.jobRepo;

import com.example.Projekt0301.Jobs.JobModel.JobModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@EnableJpaRepositories("com.example.Projekt0301.Jobs.jobRepo")
public interface JobRepo extends CrudRepository <JobModel, Integer>{

    List<JobModel> findAll();

}
