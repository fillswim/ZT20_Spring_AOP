package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspect_Combination {

    // Использование поинткатов
    //--------------------------------------------------------------------------------------------------
    // При использовании модификатора доступа public данный поинткат можно использовать в других классах
//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу или журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
//    }


    // Комбинирование поинткатов №1 (Сумма поинткатов)
    //--------------------------------------------------------------------------------------------------
    // Поинткат №1 для методов get*()
//    @Pointcut("execution(* get*())")
//    private void allGetMethodsFromUnilibrary() { }
//
//    // Advice для логгирование методов, которые берут книгу или журнал из библиотеки
//    @Before("allGetMethodsFromUnilibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//
//    // Поинткат №2 для методов return*()
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUniLibrary() { }
//
//
//    // Advice для логгирование методов, которые возвращают книгу или журнал из библиотеки
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    // Комбинация поинткатов №1 и №2
//    @Pointcut("allGetMethodsFromUnilibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() { }
//
//    // Advice для комбинированного поинтката
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    // Комбинирование поинткатов №2 (Разность поинткатов)
    //--------------------------------------------------------------------------------------------------
    // Поинткат #1, который будет подходить для всех методов класса
//    @Pointcut("execution(* com.fillswim.spring.Ch2_AOP.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary() { }
//
//    // Поинткат #2, который подходит только для мктода returnMagazine()
//    @Pointcut("execution(public void com.fillswim.spring.Ch2_AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary() { }
//
//    // Разность поинткатов #1 и #2
//    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodExceptReturnMagazineFromUnilibrary() { }
//
//    // Advice для комбинации поинткатов #1 и #2
//    @Before("allMethodExceptReturnMagazineFromUnilibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }

}
