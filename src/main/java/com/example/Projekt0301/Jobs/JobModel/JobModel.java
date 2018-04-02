package com.example.Projekt0301.Jobs.JobModel;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Jobs")
public class JobModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String nameOfJob;

    private String description;

    private String contact;

    private Date jobDate;
    private Timestamp timestamp;
    private String address;

    public JobModel(String nameOfJob, String description, Date jobdate, String contact, String address) {
        this.id= id;
        this.nameOfJob = nameOfJob;
        this.description = description;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.timestamp = timestamp;
        this.jobDate = jobdate;
        this.contact = contact;
        this.address = address;
    }

    public JobModel(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
