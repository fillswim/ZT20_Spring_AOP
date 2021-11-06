package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    // Выделение поинтката в отдельный класс
    @Pointcut("execution(* get*())")
    public void allGetMethods() { }

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() { }

}
