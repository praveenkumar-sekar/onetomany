package com.demoproject.onetomany.repository;

import com.demoproject.onetomany.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface StudentRepository extends CrudRepository<Student,Long> {
}
