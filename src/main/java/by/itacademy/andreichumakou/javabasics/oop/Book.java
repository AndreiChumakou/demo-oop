package by.itacademy.andreichumakou.javabasics.oop;

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publishingHouse;
    private int yearOfPublishing;
    private int quantityOfPages;
    private double price;

    public Book() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Enter incorrect value of id: " + id);
        } else this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.equals("")) {
            System.out.println("A title wasn't entered: " + title);
        } else this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        if (authors.equals("")) {
            System.out.println("Authors weren't entered: " + authors);
        } else this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        if (publishingHouse.equals("")) {
            System.out.println("A publishingHouse wasn't entered: " + publishingHouse);
        } else this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if (yearOfPublishing <= 0) {
            System.out.println("Enter incorrect value of yearOfPublishing: " + yearOfPublishing);
        } else this.yearOfPublishing = yearOfPublishing;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        if (quantityOfPages <= 0) {
            System.out.println("Enter incorrect value of quantityOfPages: " + quantityOfPages);
        } else this.quantityOfPages = quantityOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Enter incorrect value of price: " + price);
        } else this.price = price;
    }

    @Override
    public String toString() {
        return "Book id: " + id +
                "\n     title:            " + title +
                "\n     authors:          " + authors +
                "\n     publishingHouse:  " + publishingHouse +
                "\n     yearOfPublishing: " + yearOfPublishing +
                "\n     quantityOfPages:  " + quantityOfPages +
                "\n     price:            " + price;
    }


}
