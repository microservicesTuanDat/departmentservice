package com.example.departmentservice.repository;

import com.example.departmentservice.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository
        extends JpaRepository<Khoa, Long> {

    //Department findDepartmentById(Long departmentId);
}

