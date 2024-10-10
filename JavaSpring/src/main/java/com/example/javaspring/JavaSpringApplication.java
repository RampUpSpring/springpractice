package com.example.javaspring;

//import org.apache.catalina.core.ApplicationContext;
import com.example.javaspring.AOP.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy
public class JavaSpringApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JavaSpringApplication.class, args);

//        Main obj = context.getBean(Main.class);
//
//        try {
//            obj.method3();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


    }}

