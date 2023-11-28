/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.libraryapp;

/**
 *
 * @author hehe he
 */
public class LibraryApp {

    public static void main(String[] args) {
        Book [] books = new Book[3];
        books[0] = new Book("how to code",11,"learning","first edition",new BirthDate(3,4,2000),new Auther(1,"Ali","jordan",new BirthDate(1,1,1950)));
        
        Student [] students = new Student [3];
        students [0] = new Student(1000,"mohammad","amman",new BirthDate(5,2,1999),"cs");
        
        students [0].barrow(books[0]);
    }
}
