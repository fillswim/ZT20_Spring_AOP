package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import com.fillswim.spring.Ch2_AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyJoinPoint {

//    @Before("com.fillswim.spring.Ch2_AOP.AspectClassesBefore.Pointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {

        // Получение информации c помощью JoinPoint о сигнатуре метода бизнес-логики
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        // Получение массива параметров, которые были использованы при вызове метода с бизнес-логикой
        // Фильтрация вывода памараметров по имени метода
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object argument : arguments) {
                if (argument instanceof Book) {
                    Book book = (Book) argument;
                    System.out.println("Информация о книге: название - " + book.getName() +
                            ", автор - " + book.getAuthor() +
                            ", год издания - " + book.getYearOfPublication()
                    );
                } else if (argument instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + argument);
                }
            }
        }

    }
}
