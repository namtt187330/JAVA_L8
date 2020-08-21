/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

/**
 *
 * @author Nam
 */
public class Book {
    String name, origin, type;
    int price, noOfPage;

    public Book() {
    }

    public Book(String name, String origin, String type, int price, int noOfPage) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.price = price;
        this.noOfPage = noOfPage;
    }

    public String getName() {
        return name;
    }

    public int getNoOfPage() {
        return noOfPage;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfPage(int noOfPage) {
        this.noOfPage = noOfPage;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", numberOfPage=" + noOfPage +
                '}';
    }
    
}
