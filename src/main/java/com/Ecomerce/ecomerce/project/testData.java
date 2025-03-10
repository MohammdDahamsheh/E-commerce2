package com.Ecomerce.ecomerce.project;

import com.Ecomerce.ecomerce.project.model.test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testData extends JpaRepository<test,Integer> {
}
