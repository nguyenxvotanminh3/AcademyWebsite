package com.nguyenminh.learnwebsite.services;

import com.nguyenminh.learnwebsite.model.Students;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    List<Students> findAllStudent();
    Students save(Students students);
    Optional<Students> findStudentById(int theId);
    void deleteStudentById(int theId);


}
