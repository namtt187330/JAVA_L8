/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Lesson08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bookManagement bookManagement = new bookManagement();
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Show types book");
            System.out.println("0.Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            switch (inputUser) {
                case 1:
                    bookManagement.showLib();
                    break;
                case 2:
                    System.out.println("Name:");
                    String name = sc.nextLine();
                    System.out.println("Origin:");
                    String origin = sc.nextLine();
                    System.out.println("Type:");
                    String type = sc.nextLine();
                    System.out.println("Price:");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Number Of Page:");
                    int numberOfPage = sc.nextInt();
                    sc.nextLine();
                    Book b = new Book(name, origin, type, price, numberOfPage);
                    boolean result = bookManagement.addBook(b);
                    if (result) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Fail");
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ten sach muon xoa:");
                    String deleteBookName = sc.nextLine();
                    int response = bookManagement.deleteBook(deleteBookName);
                    if (response == 1) {
                        System.out.println("Success");
                    } else if (response == 0) {
                        System.out.println("Book not found");
                    } else {
                        System.out.println("Fail");
                    }
                    break;
                case 4:
                    System.out.println("Nhap vao ten sach muon sua");
                    String nameUpdateBook = sc.nextLine();
                    if (bookManagement.bookExistion(nameUpdateBook)) {
                        System.out.println("Name:");
                        String newName = sc.nextLine();
                        System.out.println("Origin:");
                        String newOrigin = sc.nextLine();
                        System.out.println("Type:");
                        String newType = sc.nextLine();
                        System.out.println("Price:");
                        int newPrice = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Number Of Page:");
                        int newNumberOfPage = sc.nextInt();
                        sc.nextLine();
                        Book newBook = new Book(newName, newOrigin, newType, newPrice, newNumberOfPage);
                        bookManagement.updateBook(nameUpdateBook, newBook);
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 5:
                    ArrayList<String> types = bookManagement.filterBook();
                    for (int i = 0; i < types.size(); i++) {
                        System.out.println(types.get(i));
                    }
                    break;
                case 0:
                    return;
            }
        }
    }
        // TODO code application logic here
    }
    
}
