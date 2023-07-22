package com.nguyenminh.learnwebsite.repositories;

import com.nguyenminh.learnwebsite.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends JpaRepository<Roles, String> {
}
