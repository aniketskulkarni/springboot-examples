package com.learnwithaniket.springjpa.repository;

import com.learnwithaniket.springjpa.model.AwsCertificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwsCertificateRepository extends JpaRepository<AwsCertificates, Integer> {
}
