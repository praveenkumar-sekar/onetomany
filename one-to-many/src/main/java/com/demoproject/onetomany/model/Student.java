package com.demoproject.onetomany.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(
            mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private List<Mark> marks =new ArrayList<>();

    public Student(String name){
        this.name=name;
    }
    public void setMark(List<Mark>marks){
        this.marks=marks;
    }

}
