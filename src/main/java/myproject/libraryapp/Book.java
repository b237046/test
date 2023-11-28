/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */

public class Book implements Contract {
    
    private String title;
    private int id;
    private String genre;
    private String version ;
    private BirthDate bd;
    private Auther a;
    private boolean isLoan;

    public Book(String title, int id, String genre, String version, BirthDate bd, Auther a) {
        this.title = title;
        this.id = id;
        this.genre = genre;
        this.version = version;
        this.bd = bd;
        this.a = a;
        isLoan = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }

    public Auther geta() {
        return a;
    }

    public void seta(Auther a) {
        this.a = a;
    }

    public void setIsLoan(boolean isLoan) {
        this.isLoan = isLoan;
    }
    
    
    public void returndate(){
        
    }
    
    
    
    
    
    @Override
    public boolean inLoan(){
        return isLoan;
    }
    
    
    @Override
    public String getInfo(){
        return "Title: " + this.title + ", Id: " + this.id + ", Genre: " + this.genre + ", Version: " + this.version + ", Date: " + bd.getInfo() + ", Auther: " + a.getInfo();
    }
    
    
    
    
}