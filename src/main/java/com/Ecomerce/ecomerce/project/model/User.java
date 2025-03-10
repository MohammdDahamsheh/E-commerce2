package com.Ecomerce.ecomerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name="user_email")
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_role")
    private String userRole;

    @OneToMany(mappedBy = "user")
    private List<orders> orders;

    void addOrder(orders theOrder){
        if(orders==null)orders=new ArrayList<>();
        orders.add(theOrder);
        theOrder.setUser(this);
    }

}
