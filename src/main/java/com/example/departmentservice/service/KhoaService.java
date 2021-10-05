package com.example.departmentservice.service;

import com.example.departmentservice.entity.Khoa;
import com.example.departmentservice.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class KhoaService {

    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveDepartment(Khoa derpartment) {
        log.info("Inside saveDepartment of Service! ");
        return khoaRepository.save(derpartment);
    }

    public Khoa findDeparmentById(Long departmentId) {
        log.info("inside findDeparmentById ");
        return khoaRepository.findById(departmentId).get();
    }
}
