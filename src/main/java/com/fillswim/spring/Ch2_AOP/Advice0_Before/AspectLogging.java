package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // Порядок выполнения аспектов
public class AspectLogging {

//    @Before("com.fillswim.spring.Ch2_AOP.AspectClassesBefore.Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        System.out.println("beforeAddLoggingAdvice: логирование попытки получение книги или журнала");
        System.out.println("-----------------------------------------------");
    }
}
