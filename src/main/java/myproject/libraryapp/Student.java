/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
import java.time.LocalDate;
public class Student extends Auther{
    
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
        if (barrowCount < 2 && !b.inLoan()){
            LocalDate date = LocalDate.now();
            
            System.out.print("you should return the book in ");
            System.out.println( date.plusDays(5));
            
            b.setIsLoan(true);
            barrowCount++;
        }
        else System.out.println("you can not barrow more than 3 books");
    }
    
    
    
    
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Major: " + this.getMajor();
    }
    
}
