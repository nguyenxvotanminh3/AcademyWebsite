package com.nguyenminh.learnwebsite.repositories;

import com.nguyenminh.learnwebsite.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students, Integer>{

}