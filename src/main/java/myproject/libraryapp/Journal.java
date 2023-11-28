/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
public class Journal extends Book implements Contract {
    
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, int id, String genre, String edition, BirthDate bd, Auther a,String conferenceName, int conferenceNo) {
        super(title, id, genre, edition, bd, a);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }
    
    
    
    @Override
     public boolean inLoan(){
        return super.inLoan();
    }
    
    @Override
    public String getInfo(){
        return super.getInfo() + ", Conference_Name: " + this.conferenceName + ", Conference_Number: " + this.conferenceNo;
    }
    
    
    
}