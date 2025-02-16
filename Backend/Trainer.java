/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yara
 */
public  class Trainer extends Record{
    private String name;
    private String email;
    private String speciality;
    private String phoneNumber;
    
    
    public Trainer(String id, String name, String email, String speciality, String phoneNumber) {
        super(id);
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String lineRepresentation() {
        return String.join(",", id, name, email, speciality, phoneNumber);
    }
   @Override
    public String getSearchKey() {
        return id;
    }
} 
    
    

