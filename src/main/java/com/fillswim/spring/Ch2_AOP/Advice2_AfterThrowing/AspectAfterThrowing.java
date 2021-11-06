package com.fillswim.spring.Ch2_AOP.Advice2_AfterThrowing;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAfterThrowing {

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "myExeption")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable myExeption) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения: " + myExeption);
    }

}
