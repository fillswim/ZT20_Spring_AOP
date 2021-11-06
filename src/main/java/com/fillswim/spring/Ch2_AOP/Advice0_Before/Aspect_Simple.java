package com.fillswim.spring.Ch2_AOP.Advice0_Before;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // Порядок выполнения аспектов
public class Aspect_Simple {

    // Будет работать для всех методов "public void getBook()" во всех классах
//    @Before("execution(public void getBook()))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать только для определенного метода в определенном классе
//    @Before("execution(public void com.fillswim.spring.Ch2_AOP.UniLibrary.getBook()))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для всех методов, начинающихся с get*
//    @Before("execution(public void get*()))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для метода returnBook() с любым возвращаемым типом
//    @Before("execution(public * returnBook()))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

    // Будет работать для любого возвращаемого типа и любого модификатора доступа
//    @Before("execution(* returnBook()))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

    // Будет работать для любого возвращаемого типа, любого модификатора доступа и любого названия метода
//    @Before("execution(* *()))")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }

    // Будет работать только для всех методов "public void getBook()" c параметром String
//    @Before("execution(public void getBook(String)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для всех методов "public void getBook()" c одним любым параметром
//    @Before("execution(public void getBook(*)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для любого метода с одним любым параметром
//    @Before("execution(public void *(*)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для любого метода с любым количеством любых параметров
//    @Before("execution(public void *(..)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для любого метода getBook() с параметром Book
//    @Before("execution(public void getBook(com.fillswim.spring.Ch2_AOP.Book)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для любого метода с любым возвращаемым значением и любым количеством любых параметров
//    @Before("execution(* *(..)))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    // Будет работать для любого метода get* без параметров
//    @Before("execution(* get*()))")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу или журнал");
//    }

}
