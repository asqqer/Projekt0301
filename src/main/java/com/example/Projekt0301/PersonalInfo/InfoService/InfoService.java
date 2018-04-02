package com.example.Projekt0301.PersonalInfo.InfoService;

import com.example.Projekt0301.PersonalInfo.InfoModel.InfoModel;
import com.example.Projekt0301.PersonalInfo.InfoRepo.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    @Autowired
    InfoRepo infoRepo;

    public List<InfoModel> list() {
        return (List<InfoModel>) infoRepo.findAll();
    }

    public void addlist(){

    }

}
