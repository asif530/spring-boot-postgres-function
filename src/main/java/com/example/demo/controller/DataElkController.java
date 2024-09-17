package com.example.demo.controller;

import com.example.demo.service.DataElkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/elk")
@AllArgsConstructor
public class DataElkController {
    private DataElkService dataElkService;
    @GetMapping("/getDataByCountry")
    private List<?> getDataByCountry(){
        return dataElkService.getCountryWiseData();
    }

    @GetMapping("/getDataByCountryFuncyion")
    private List<?> getDataByCountryFuncyion(){
        return dataElkService.getWithFunction();
    }

    @GetMapping("/getProjectionNoEntity")
    private List<?> getProjectionNoEntity(){
        return dataElkService.getProjectionNoEntity();
    }
}
