package com.fillswim.spring.Ch2_AOP.Advice1_AfterReturning;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов " +
                "перед методом getStudents");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

//    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsLoggingAdvice() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов " +
                "после завершения работы метода getStudents");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

}
