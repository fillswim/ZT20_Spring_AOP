package com.fillswim.spring.Ch2_AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Method main starts");

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class)) {

            LibraryOfUniversity library = context.getBean("libraryOfUniversity", LibraryOfUniversity.class);
            String bookName = library.returnBook();
            System.out.println("В библиотеку вернули книгу " + bookName);

        }

        System.out.println("Method main ends");
    }
}
