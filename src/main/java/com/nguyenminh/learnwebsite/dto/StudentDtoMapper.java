package com.nguyenminh.learnwebsite.dto;

import com.nguyenminh.learnwebsite.model.Students;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Service
public class StudentDtoMapper implements Function<Students , StudentDto> {
    @Override
    public StudentDto apply(Students students) {
        return new StudentDto(
                students.getId(),
                students.getEmail(),
                students.getName(),
                students.getImageUrl(),
                students.getGender(),
                students.getNumber()

        );
    }
}
