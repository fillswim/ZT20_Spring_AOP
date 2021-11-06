package com.fillswim.spring.Ch2_AOP;

import com.fillswim.spring.Ch2_AOP.Advice1_AfterReturning.Student;
import com.fillswim.spring.Ch2_AOP.Advice1_AfterReturning.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class)) {

            University university = context.getBean("university", University.class);
            university.addStudents();

            List<Student> students = null;

            try {
                students = university.getStudents();
                System.out.println(students);
            } catch (Exception e) {
                System.out.println("Было поймано исключение " + e);
            }

        }
    }
}
