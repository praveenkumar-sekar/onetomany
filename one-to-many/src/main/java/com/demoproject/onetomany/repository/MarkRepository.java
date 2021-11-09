package com.demoproject.onetomany.repository;

import com.demoproject.onetomany.model.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MarkRepository extends CrudRepository <Mark,Long> {
}
