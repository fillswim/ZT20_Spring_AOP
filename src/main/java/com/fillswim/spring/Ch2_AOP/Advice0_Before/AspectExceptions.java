package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3) // Порядок выполнения аспектов
public class AspectExceptions {

//    @Before("com.fillswim.spring.Ch2_AOP.AspectClassesBefore.Pointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем исключения " +
                "при попытке получитькнигу или журнал");
        System.out.println("-----------------------------------------------");
    }
}
