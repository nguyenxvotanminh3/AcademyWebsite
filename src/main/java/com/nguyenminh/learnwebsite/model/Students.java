package com.nguyenminh.learnwebsite.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "students")
public class Students {
    @Id
    @Column(name = "id")
    private String id ;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "roles_key")
    private Roles roles;
    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "gender")
    private String gender;

    @Column(name = "user_name" , nullable = false)
    private String userName;

    @Column(name = "password" , nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    public Students() {
    }

    public Students(String id, String name, String userName, String password, String email, String job) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }



}
