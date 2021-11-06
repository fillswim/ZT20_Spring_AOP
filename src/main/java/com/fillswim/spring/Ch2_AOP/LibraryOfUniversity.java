package com.fillswim.spring.Ch2_AOP;

import org.springframework.stereotype.Component;

@Component
public class LibraryOfUniversity extends LibraryAbstract {

    public void getBook() {
        System.out.println("Мы берем книгу из LibraryOfUniversity");
        System.out.println("-----------------------------------------------");
    }

//    public void returnBook() {
//        System.out.println("Мы возвращаем книгу в LibraryOfUniversity");
//        System.out.println("-----------------------------------------------");
//    }

    // Измененный метод returnBook() для @Around Advice
    public String returnBook() {
        System.out.println("Мы возвращаем книгу в LibraryOfUniversity");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из LibraryOfUniversity");
        System.out.println("-----------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в LibraryOfUniversity");
        System.out.println("-----------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в LibraryOfUniversity");
        System.out.println("-----------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в LibraryOfUniversity");
        System.out.println("-----------------------------------------------");
    }

}
