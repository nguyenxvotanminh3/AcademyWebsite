package com.nguyenminh.learnwebsite.services;

import com.nguyenminh.learnwebsite.model.Roles;
import com.nguyenminh.learnwebsite.repositories.RolesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService{

    private final RolesRepo rolesRepo;

    public RolesServiceImpl(RolesRepo rolesRepo){
        this.rolesRepo = rolesRepo;
    }
    @Override
    public List<Roles> findAll() {
        return rolesRepo.findAll();
    }
}
