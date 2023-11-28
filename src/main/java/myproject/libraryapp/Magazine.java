/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
public class Magazine extends Book implements Contract {
    
    private int issueNo ;
    private BirthDate releaseDate;

    public Magazine( String title, int id, String genre, String edition, BirthDate bd, Auther a,int issueNo, BirthDate releaseDate) {
        super(title, id, genre, edition, bd, a);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public BirthDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(BirthDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    
    
    @Override
     public boolean inLoan(){
        return super.inLoan();
    }
    
    @Override
    public String getInfo(){
        return super.getInfo() + ", Issue_Number: " + this.issueNo + ", Release_Date: " + this.releaseDate;
    }
    
    
}
