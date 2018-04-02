package com.example.Projekt0301.Jobs.JobService;

import com.example.Projekt0301.Jobs.JobModel.JobModel;
import com.example.Projekt0301.Jobs.jobRepo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public List<JobModel> list(){
        return jobRepo.findAll();
    }

    public void addlist(){
        jobRepo.save(new JobModel("DR2","Job i dr koncertsal",new Date( 01,01,2017),"Daniel","Dr"));
    }

}
