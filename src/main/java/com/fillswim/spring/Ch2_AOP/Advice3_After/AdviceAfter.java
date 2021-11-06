package com.fillswim.spring.Ch2_AOP.Advice3_After;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdviceAfter {

//    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода " +
                "или выброс исключения");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

}
