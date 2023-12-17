/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryApp {
    
     private static Book searchBookByName(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                return book;
            }
        }
        return null;}
     
     private static Book searchBookByAutherName(ArrayList<Book> books, String auther) {
        for (Book book : books) {
            if (book.geta().getName().equals(auther)) {
                return book;
            }
        }
        return null;}
        
     private static Book searchBookById(ArrayList<Book> books, int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;}
     
     private static Student searchStudentByName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;}
     
     
    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("howtocode",10,"learning","first edition",new BirthDate(3,4,2000),new Auther(1,"Ali","jordan",new BirthDate(1,1,1950))));
        books.add(new Book("sandrella",11,"fiction","second edition",new BirthDate(5,10,1988),new Auther(2,"jakson","england",new BirthDate(3,10,1940))));
        books.add(new Book("calculus",12, "scientific","fifth edition",new BirthDate(20,10,1972),new Auther(3,"Ahmad","florida",new BirthDate(5,5,1930))));
        books.add(new Book("snow white",13,"fiction","first edition",new BirthDate(1,1,1930),new Auther(4,"hamza","hebron",new BirthDate(10,10,1900))));
        books.add(new Book("Think and Grow Rich",14,"self help","tenth edition",new BirthDate(30,2,2000),new Auther (5,"hasan","nablus",new BirthDate(17,2,1983))));
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1000,"mohammad","amman",new BirthDate(5,2,1999),"cs"));
        students.add(new Student(1001,"hani","hebron",new BirthDate(3,3,2001),"physics"));
        students.add(new Student(1002,"Abed","hebron",new BirthDate(10,10,2005),"business"));
         OUTER:
         while (true) {
             System.out.println("1-Add Books to the Library");
             System.out.println("2-Add Students to the Library");
             System.out.println("3-Search for a book by its name");
             System.out.println( "4-Search for a book by its id");
             System.out.println("5-Search for a book by its auther name");
             System.out.println("6-Check The Book's Loan");
             System.out.println("7-Student want to barrow a Book");
             System.out.println("8-Exit");
             System.out.print("Enter choice : ");
             int choice;
             Scanner input = new Scanner(System.in);
             choice = input.nextInt();
             
             
             switch (choice) {
                 case 1 -> {
                     System.out.println("\nEnter Book name, id, genre, version, Date (dd,mm,yyyy) AND auther id, name, address, Birth_date (dd,mm,yyyy)");
                     books.add(new Book(input.next(),input.nextInt(),input.next(),input.next(),new BirthDate(input.nextInt(),input.nextInt(),input.nextInt()),
                             new Auther(input.nextInt(),input.next(),input.next(),new BirthDate(input.nextInt(),input.nextInt(),input.nextInt()))));
                     System.out.println("The Book added successfully\n\n");
                }
                 case 2 -> {
                     System.out.println("\nEnter Studen id, name, address, Birth_date (dd,mm,yyyy), major");
                     students.add(new Student(input.nextInt(),input.next(),input.next(),new BirthDate(input.nextInt(),input.nextInt(),input.nextInt()),input.next()));
                     System.out.println("The Student added successfully\n\n");
                 }
                 case 3 -> {
                     System.out.print("Enter Book name : ");
                     if (searchBookByName(books,input.next()) != null)
                         System.out.println("The Book is Available\n\n");
                     else System.out.println("The Book is NOT Available\n\n");
                }
                 case 4 -> {
                     System.out.print("Enter Book id : ");
                     if (searchBookById(books,input.nextInt()) != null)
                         System.out.println("The Book is Available\n\n");
                     else System.out.println("The Book is NOT Available\n\n");
                }
                 case 5 -> {
                     System.out.print("Enter Book's Auther name : ");
                     if (searchBookByAutherName(books,input.next()) != null )
                         System.out.println("The Book is Available\n\n");
                     else System.out.println("The Book is NOT Available\n\n");
                }
                 case 6 -> {
                     System.out.print("Enter Book name you want to check : ");
                     System.out.println("Is the book in loan? " + searchBookByName(books,input.next()).inLoan() + "\n\n");
                }
                 case 7 ->{
                     System.out.print("Enter Student name AND the Book to barrow : ");
                     searchStudentByName(students,input.next()).barrow(searchBookByName(books,input.next()));
                 }
                 case 8 ->{
                     System.exit(0);
                 }
                 default -> System.out.println("Invalid choice try again\n\n");
             }
         }
        
        
         
         
         
         
    }
}
