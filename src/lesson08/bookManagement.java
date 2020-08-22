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

    public boolean isExistBook(String nameOfBook) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameOfBook)) {
                return true;
            }
        }
        return false;
    }

    public int deleteBook(String nameBook) {
        Book book = new Book();
        boolean isBookExist = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameBook)) {
                book = library.get(i);
                isBookExist = true;
            }
        }
        if (isBookExist) {
            boolean response = library.remove(book);
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

    public ArrayList<Book> sortByPrice() {
        ArrayList<Book> books = library;
        Book temp = new Book();
        temp.setPrice(0);
        for (int j = 0; j < library.size(); j++) {
            for (int i = 0; i < library.size() - 1 - j; i++) {
                if (library.get(i).getPrice() > library.get(i + 1).getPrice()) {
                    temp.setName(library.get(i).getName());
                    temp.setNoOfPage(library.get(i).getNoOfPage());
                    temp.setOrigin(library.get(i).getOrigin());
                    temp.setType(library.get(i).getType());
                    temp.setPrice(library.get(i).getPrice());

                    library.get(i).setName(library.get(i + 1).getName());
                    library.get(i).setPrice(library.get(i + 1).getPrice());
                    library.get(i).setOrigin(library.get(i + 1).getOrigin());
                    library.get(i).setType(library.get(i + 1).getType());
                    library.get(i).setNoOfPage(library.get(i + 1).getNoOfPage());

                    library.get(i + 1).setName(temp.getName());
                    library.get(i + 1).setPrice(temp.getPrice());
                    library.get(i + 1).setOrigin(temp.getOrigin());
                    library.get(i + 1).setType(temp.getType());
                    library.get(i + 1).setNoOfPage(temp.getNoOfPage());
                }
            }
        }
        return library;
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
