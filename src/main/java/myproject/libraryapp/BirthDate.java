/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author hehe he
 */
public class BirthDate implements Serializable {
    
    private int day;
    private int month;
    private int year;

    public BirthDate() {
    }
    
    
    
    public BirthDate(int day, int month, int year) {

        setDay(day);
        setMonth(month);
        setYear(year);
        
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        while (day <= 0 || day > 31) {
            JOptionPane.showMessageDialog(null, "Invalid day! Please enter a day between 1 and 31.");
            String input = JOptionPane.showInputDialog("Enter day:");
            day = Integer.parseInt(input);
        }

        this.day = day;
        
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        
        while (month < 1 || month > 12) {
            JOptionPane.showMessageDialog(null, "Invalid month! Please enter a month between 1 and 12.");
            String input = JOptionPane.showInputDialog("Enter month:");
            month = Integer.parseInt(input);
        }

        this.month = month;
        
         
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        
        int temp = year;
        int count = 0;
        while (Math.abs(temp) != 0) {
            count++;
            temp = temp / 10;
        }
        while (count != 4 || year < 0 || year > 2024) {
            JOptionPane.showMessageDialog(null, "Invalid year! Please enter a valid one");
            String input = JOptionPane.showInputDialog("Enter year:");
            year = Integer.parseInt(input);

            temp = year;
            count = 0;
            while (Math.abs(temp) != 0) {
                count++;
                temp = temp / 10;
            }

        }

        this.year = year; 
    }
    
    
    
    
    public String getInfo(){
        return  this.day + "/" + this.month + "/" + this.year;
    }
    
}
