package com.fillswim.spring.Ch2_AOP.Advice4_Around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdviceAround {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
        System.out.println("-----------------------------------------------");
        System.out.println();

        Long begin = System.currentTimeMillis();

        // Обработка target - метода
        // Сохраняется результат работы метода
        Object targetMethodResult = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "метод returnBook() выполнил работу за " + (end - begin) + " ms");
        System.out.println("-----------------------------------------------");
        System.out.println();

        return targetMethodResult;
    }

}
