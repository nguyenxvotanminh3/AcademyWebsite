package com.nguyenminh.learnwebsite.controller;


import com.nguyenminh.learnwebsite.model.Roles;
import com.nguyenminh.learnwebsite.services.RolesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    private final RolesServiceImpl rolesService;
    public RolesController(RolesServiceImpl rolesService) {
        this.rolesService = rolesService;
    }
    @GetMapping
    public List<Roles> getAllStudent(){
        return rolesService.findAll();
    }


}
