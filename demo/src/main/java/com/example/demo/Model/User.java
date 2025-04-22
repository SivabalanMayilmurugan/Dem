package com.example.demo.Model;

import org.hibernate.annotations.GeneratedColumn;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
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
