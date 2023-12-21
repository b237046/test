/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */

import java.io.Serializable;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Student extends Auther implements Serializable{
    
    private String major;
    private int barrowCount;
    
    public Student(){
        
    }
    
    public Student (int id, String name, String address, BirthDate bd, String major){
        super(id,name,address,bd);
        this.major = major;
        barrowCount = 0;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getBarrowCount() {
        return barrowCount;
    }

    public void setBarrowCount(int barrowCount) {
        this.barrowCount = barrowCount;
    }
    
    
    
    
    
    public void barrow(Book b){      
        if (barrowCount < 3 && !b.inLoan()){
            LocalDate date = LocalDate.now();
            
            JOptionPane.showMessageDialog(null,"no problems appeared, put make sure to return it in " + date.plusDays(5));
            
            b.setIsLoan(true);
            barrowCount++;
        }
        else if (barrowCount >= 3) JOptionPane.showMessageDialog(null, "you can not barrow more than 3 books");
        else if (b.inLoan()) JOptionPane.showMessageDialog(null,"you can not barrow a book that has already been barrowed");
    }
    
    
    
    
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Major: " + this.getMajor();
    }
    
}
