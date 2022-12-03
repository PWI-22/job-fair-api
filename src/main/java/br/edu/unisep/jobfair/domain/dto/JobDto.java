package br.edu.unisep.jobfair.domain.dto;

import lombok.Data;

@Data
public class JobDto {

    private Integer id;

    private String title;
    private String details;
    private String company;
    private String industry;
    private String qualifications;

    private Double salary;

}
