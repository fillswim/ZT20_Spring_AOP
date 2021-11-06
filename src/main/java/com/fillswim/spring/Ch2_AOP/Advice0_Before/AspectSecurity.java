package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2) // Порядок выполнения аспектов
public class AspectSecurity {

//    @Before("com.fillswim.spring.Ch2_AOP.AspectClassesBefore.Pointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: проверка прав на получение книги или журнала");
        System.out.println("-----------------------------------------------");
    }
}
