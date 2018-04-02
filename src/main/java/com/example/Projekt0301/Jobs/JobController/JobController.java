package com.example.Projekt0301.Jobs.JobController;

import com.example.Projekt0301.Jobs.JobModel.JobModel;
import com.example.Projekt0301.Jobs.JobService.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping(method = RequestMethod.GET, value = "/jobList")
    public @ResponseBody
    List<JobModel> jobs() throws Exception{
        return jobService.list();
    }
}
