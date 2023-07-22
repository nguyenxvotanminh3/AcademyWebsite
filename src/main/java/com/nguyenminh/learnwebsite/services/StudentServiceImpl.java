package com.nguyenminh.learnwebsite.services;

import com.nguyenminh.learnwebsite.model.Students;
import com.nguyenminh.learnwebsite.repositories.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;}

    @Override
    public List<Students> findAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Students save(Students students) {
        return studentRepo.save(students);
    }

    @Override
    public Optional<Students> findStudentById(int theId) {
        Optional<Students> student = studentRepo.findById(theId);
        Optional<Students> theTemp = Optional.empty();
        if(student == theTemp){
             throw new RuntimeException("No student found");
        } else {
       return studentRepo.findById(theId); }

    }

    @Override
    public void deleteStudentById(int theId) {

        Optional<Students> student = studentRepo.findById(theId);
        Optional <Students> theTemp = Optional.empty();

        if( student == theTemp  ) {
            throw new RuntimeException("no student found");
        }
        studentRepo.deleteById(theId);

    }








}
