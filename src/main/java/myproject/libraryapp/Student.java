/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */

public class Student extends Person{
    
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
            b.setIsLoan(true);
            barrowCount++;
        }
    }
    
    
    
    
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Major: " + this.getMajor();
    }
    
}
