package com.nguyenminh.learnwebsite.controller;

import com.nguyenminh.learnwebsite.dto.StudentDto;
import com.nguyenminh.learnwebsite.dto.StudentDtoMapper;
import com.nguyenminh.learnwebsite.model.Students;

import com.nguyenminh.learnwebsite.services.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentServiceImpl studentService;
    private  final StudentDtoMapper studentDtoMapper;
    public StudentController(StudentServiceImpl studentService, StudentDtoMapper studentDtoMapper){
        this.studentService = studentService;

        this.studentDtoMapper = studentDtoMapper;
    }
    @GetMapping
    public List<StudentDto> getAllStudent(){
        return studentService.findAllStudent()
                .stream()
                .map(studentDtoMapper)
                .collect(Collectors.toList());
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
