/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

import java.util.ArrayList;

/**
 *
 * @author Nam
 */
public class bookManagement {

    ArrayList<Book> library = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();

    public void showLib() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());

        }
    }

    public boolean addBook(Book book) {
        try {
            library.add(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateBook(String oldBookName, Book newBook) {
        int indexOfBook = -1;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).equals(oldBookName)) {
                indexOfBook = i;
            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            library.set(indexOfBook, newBook);
            return true;
        }

    }

    public boolean bookExistion(String bookName) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public int deleteBook(String bookName) {
        boolean check = this.bookExistion(bookName);
        boolean response = false;
        if (check) {
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).toString().equals(bookName)) {                                                            
                }
            }
            if (response) {
                return 1;
            } else {
                return -1;
            }

        } else {
            return 0;
        }
    }

    public ArrayList<String> filterBook() {
        for (int i = 0; i < library.size(); i++) {
            String currentBookType = library.get(i).toString();
            boolean isNew = true;
            for (int j = 0; j < type.size(); j++) {
                if (currentBookType.equals(type.get(j))) {
                    isNew = false;
                }
            }
            if (isNew) {
                type.add(currentBookType);
            }
        }
        return type;
    }

    public String priceCheck(Book book, int price1, int price2) {
        for (int i = 0; i < library.size(); i++) {
            if (price1<book.price<price2){
                
            }

        }
    }

    public ArrayList<String> bookTypeFilter() {
        for (int i = 0; i < library.size(); i++) {
            String current = library.get(i).getType();
            boolean newType = true;
            for (int j = 0; j < type.size(); j++) {
                if (current.equals(type.get(j))) {
                    newType = false;
                }
            }
            if (newType) {
                type.add(current);
            }
        }
        return type;
    }
}
