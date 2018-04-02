package com.example.Projekt0301.PersonalInfo.InfoController;

import com.example.Projekt0301.PersonalInfo.InfoService.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class InfoController {

    @Autowired
    InfoService infoService;
}
