package com.fillswim.spring.Ch2_AOP;

import org.springframework.stereotype.Component;

@Component
public class LibraryOfSchool extends LibraryAbstract {

    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
