package com.Ecomerce.ecomerce.project.service;

import com.Ecomerce.ecomerce.project.model.User;
import com.Ecomerce.ecomerce.project.model.userPrinciple;
import com.Ecomerce.ecomerce.project.reposetory.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsServise implements UserDetailsService {
    @Autowired
    private userRepo userRepo;
    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException(username);
        return new userPrinciple(user);
    }
}
