package br.edu.unisep.jobfair.domain.builder.impl;

import br.edu.unisep.jobfair.data.entity.Company;
import br.edu.unisep.jobfair.data.entity.Job;
import br.edu.unisep.jobfair.domain.builder.JobBuilder;
import br.edu.unisep.jobfair.domain.dto.CreateJobDto;
import br.edu.unisep.jobfair.domain.dto.JobDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobBuilderImpl implements JobBuilder {

    @Override
    public Job build(CreateJobDto createJob) {
        var job = new Job();
        job.setTitle(createJob.getTitle());
        job.setDetails(createJob.getDetails());
        job.setQualifications(createJob.getQualifications());
        job.setSalary(createJob.getSalary());

        var company = new Company();
        company.setId(createJob.getCompanyId());

        job.setCompany(company);

        return job;
    }

    @Override
    public JobDto build(Job job) {
        var dto = new JobDto();
        dto.setId(job.getId());
        dto.setCompany(job.getCompany().getName());
        dto.setIndustry(job.getCompany().getIndustry().getName());
        dto.setTitle(job.getTitle());
        dto.setDetails(job.getDetails());
        dto.setQualifications(job.getQualifications());
        dto.setSalary(job.getSalary());

        return dto;
    }

    @Override
    public List<JobDto> build(List<Job> jobs) {
        return jobs.stream().map(this::build).toList();
    }
}
