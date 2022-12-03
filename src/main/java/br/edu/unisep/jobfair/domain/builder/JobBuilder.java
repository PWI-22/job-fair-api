package br.edu.unisep.jobfair.domain.builder;

import br.edu.unisep.jobfair.data.entity.Job;
import br.edu.unisep.jobfair.domain.dto.CreateJobDto;
import br.edu.unisep.jobfair.domain.dto.JobDto;

import java.util.List;

public interface JobBuilder {

    Job build(CreateJobDto createJob);

    JobDto build(Job job);

    List<JobDto> build(List<Job> jobs);

}
