/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
public class BirthDate {
    
    private int day;
    private int month;
    private int year;

    public BirthDate(int day, int month, int year) {
        
        int temp = year;
        int count = 0;
        while (Math.abs(temp) != 0){
            count++;
            temp = temp / 10;
        }
        
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && count == 4 && year > 0){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        else System.out.println("The Date is invaled !!!");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else System.out.println("The day is invaled !!!");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else System.out.println("The month is invaled !!!");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        
        int temp = year;
        int count = 0;
        while (Math.abs(temp) != 0){
            count++;
            temp = temp / 10;
        }
        if (count == 4 && year > 0){
            this.year = year;
        }
        else System.out.println("The year is invaled !!!");
        
        
    }
    
    
    
    
    public String getInfo(){
        return  this.day + "/" + this.month + "/" + this.year;
    }
    
}
