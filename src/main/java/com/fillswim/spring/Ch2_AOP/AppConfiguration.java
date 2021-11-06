package com.fillswim.spring.Ch2_AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.fillswim.spring.Ch2_AOP")
@EnableAspectJAutoProxy
public class AppConfiguration {
}
