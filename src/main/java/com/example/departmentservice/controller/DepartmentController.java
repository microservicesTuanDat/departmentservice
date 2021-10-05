package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Khoa;
import com.example.departmentservice.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
@Slf4j
public class DepartmentController {

    @Autowired
    private KhoaService khoaService;


    @PostMapping("/")
    public Khoa saveDeparment(@RequestBody Khoa derpartment){
        log.info("inside saveDeparment method if Department controller!");
        return khoaService.saveDepartment(derpartment);
    }

    @GetMapping("/{id}")
    public Khoa findDeparmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDeparmentById method if Department controller!");
        return khoaService.findDeparmentById(departmentId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Pham Tuan Dat!";
    }
}
