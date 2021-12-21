/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author akshat
 */
@Entity
public class Employee extends BaseEntity<Long>{
    
    @Column(name = "fullname")
    private String fullName;
    
    @Column(name = "email")
    private String email;
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
    
    

}
