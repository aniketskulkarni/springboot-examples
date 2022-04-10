package com.learnwithaniket.springjpa.repository;

import com.learnwithaniket.springjpa.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
}
