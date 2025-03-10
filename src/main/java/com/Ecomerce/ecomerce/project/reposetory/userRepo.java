package com.Ecomerce.ecomerce.project.reposetory;

import com.Ecomerce.ecomerce.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
