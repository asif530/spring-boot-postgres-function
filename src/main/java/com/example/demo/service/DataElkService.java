package com.example.demo.service;

import com.example.demo.repository.DataElkRepository;
import com.example.demo.repository.TestProjectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DataElkService {
    private DataElkRepository dataElkRepository;
    private TestProjectionRepository testProjectionRepository;

    public List<?> getCountryWiseData(){
        return dataElkRepository.getDataElkByCountry("Australia");
    }

    public List<?> getWithFunction(){
        return dataElkRepository.getWithFunction("Australia");
    }

    public List<?> getProjectionNoEntity(){
        //works
        //return dataElkRepository.getProjectionNoEntity();
        //does not work
        return testProjectionRepository.getProjectionNoEntity();
    }
}