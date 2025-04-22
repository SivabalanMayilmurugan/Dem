package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    private String membership;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getMship(){
        return membership;
    }
    public void setMship(String membership){
        this.membership=membership;
    }
    
}
