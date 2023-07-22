package com.nguyenminh.learnwebsite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "authorities")
public class Roles {
    @Id
    @Column(name = "role")
    private String role;
    @OneToMany(mappedBy = "roles" ,cascade = CascadeType.ALL , orphanRemoval = true)
    private Set<Students> students;

}
