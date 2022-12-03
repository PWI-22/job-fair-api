package br.edu.unisep.jobfair.data.entity;

import lombok.Data;

@Data
public class Job {

    private Integer id;

    private String title;

    private String details;

    private String qualifications;

    private Company company;

    private Double salary;

}
