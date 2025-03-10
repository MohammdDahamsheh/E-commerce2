package com.Ecomerce.ecomerce.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "test")
public class test {
    @Id
    @Column(name = "num")
    int num;
    @Column(name = "name")
    String name;

    public test(int num, String name) {
        this.num = num;
        this.name = name;
    }
    public test() {

    }

//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
