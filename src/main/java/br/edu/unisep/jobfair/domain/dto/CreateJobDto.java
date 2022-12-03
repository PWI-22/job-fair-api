package br.edu.unisep.jobfair.domain.dto;

import lombok.Data;

@Data
public class CreateJobDto {

    private String title;
    private String details;
    private String qualifications;
    private Integer companyId;
    private Double salary;

}
