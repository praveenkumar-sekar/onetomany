package com.demoproject.onetomany.model;

import javax.persistence.*;

@Entity
@Table(name = "Mark")

public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String percentage;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Mark(String percentage, Student student){
        this.percentage=percentage;
        this.student=student;
    }
}
