package com.example.student_menagment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
    
    @Email(message = "Enter a valid email")
    private String email;

    @NotBlank(message = "Course is required")
    private String course;


    public Student() {}

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }



    public Long getId() {
        return id;
    }

    public String getName(){
        return this.name;
    } 
    public String getEmail(){
        return this.email;
    }
    public String getCourse(){
        return this.course;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public void setCourse(String c){
        this.course = c;
    }



}

