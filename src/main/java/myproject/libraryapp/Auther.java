/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

import java.io.Serializable;

/**
 *
 * @author hehe he
 */

public class Auther implements Serializable {
    
    private int id;
    private String name;
    private String address;
    private BirthDate bd;

    public Auther(){
        
    }
    
    public Auther(int id, String name, String address, BirthDate bd) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bd = bd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }
    
    public String getInfo(){
        return "Id: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", Birht_Date: " + this.bd.getInfo();
    }
}
