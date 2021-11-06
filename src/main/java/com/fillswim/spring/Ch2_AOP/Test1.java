package com.fillswim.spring.Ch2_AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class) ) {

            LibraryOfUniversity libraryOfUniversity = context.getBean("libraryOfUniversity", LibraryOfUniversity.class);
            Book book = context.getBean("book", Book.class);

            libraryOfUniversity.getBook();
//            libraryOfUniversity.addBook("Oleg", book);
//            libraryOfUniversity.addMagazine();

//            libraryOfUniversity.getMagazine();

//            uniLibrary.returnMagazine();
//            uniLibrary.addBook();

//            uniLibrary.returnBook();
//            uniLibrary.getMagazine();

//            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//            schoolLibrary.getBook();

        }

    }
}
