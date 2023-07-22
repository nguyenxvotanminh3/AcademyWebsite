package com.nguyenminh.learnwebsite.controller;

import com.nguyenminh.learnwebsite.model.Roles;
import com.nguyenminh.learnwebsite.model.Students;
import com.nguyenminh.learnwebsite.services.RolesServiceImpl;

import com.nguyenminh.learnwebsite.services.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService ){
        this.studentService = studentService;

    }
    @GetMapping
    public List<Students> getAllStudent(){
        return studentService.findAllStudent();
    }
    @GetMapping("/{id}")
    public Optional<Students> getStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }
    @PostMapping("/create")
    public Students addStudent(@RequestBody Students students){
        return studentService.save(students);
    }
    @PutMapping("/update")
    public Students updateStudent (@RequestBody Students students){
        Students students1 = students;
        return studentService.save(students1);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById (@PathVariable int id){
         studentService.deleteStudentById(id);
    }





}
