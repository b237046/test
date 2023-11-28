/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
import java.util.ArrayList;
public class LibraryApp {
    
     private static void searchBookByName(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                System.out.println("The Book is available.");
                return;
            }
        }
        System.out.println("The Book is not available.");}
     
     private static void searchBookByAutherName(ArrayList<Book> books, String auther) {
        for (Book book : books) {
            if (book.geta().getName().equals(auther)) {
                System.out.println("The Book is available.");
                return;
            }
        }
        System.out.println("The Book is not available.");}
     
     private static void searchBookById(ArrayList<Book> books, int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("The Book is available.");
                return;
            }
        }
        System.out.println("The Book is not available.");}
     
     
     
    public static void main(String[] args) {
        
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("how to code",10,"learning","first edition",new BirthDate(3,4,2000),new Auther(1,"Ali","jordan",new BirthDate(1,1,1950))));
        books.add(new Book("sandrella",11,"fiction","second edition",new BirthDate(5,10,1988),new Auther(2,"jakson","england",new BirthDate(3,10,1940))));
        books.add(new Book("calculus",12, "scientific","fifth edition",new BirthDate(20,10,1972),new Auther(3,"Ahmad","florida",new BirthDate(5,5,1930))));
        books.add(new Book("snow white",13,"fiction","first edition",new BirthDate(1,1,1930),new Auther(4,"hamza","hebron",new BirthDate(10,10,1900))));
        books.add(new Book("Think and Grow Rich",14,"self help","tenth edition",new BirthDate(30,2,2000),new Auther (5,"hasan","nablus",new BirthDate(17,2,1983))));
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1000,"mohammad","amman",new BirthDate(5,2,1999),"cs"));
        students.add(new Student(1001,"hani","hebron",new BirthDate(3,3,2001),"physics"));
        students.add(new Student(1002,"Abed","hebron",new BirthDate(10,10,2005),"business"));
        
        
        searchBookByName(books,"how to code");
        searchBookByAutherName(books,"Ahmad");
        searchBookById(books,3);
        
        
        
//        students [0].barrow(book());
//        students [0].barrow(books[1]);
//        students [0].barrow(books[2]);
//        
//        System.out.println(books[0].inLoan());
//        System.out.println(books[2].inLoan());
//        
//        
//        
//        int x = 10;
//        System.out.println(books [0].doesIdExist(x));
//        System.out.println(books[1].doesTitleExist("sandrella"));
    
    }
}
