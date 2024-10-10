package com.example.javaspring.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public  class AspectExample {

    @Pointcut("execution(* Main.*(..))")
    public void PointCutMethod() {}


    //    @Before("execution(* com.example.javaspring.JavaSpringApplication.Main.*(..))")
    //    public  void loggingBefore(){
    //        System.out.println("Before Logging");
    //    }
    //
    //
    //
    //    @After("execution(* com.example.javaspring.JavaSpringApplication.Main.*(..))")
    //    public  void loggingAfter(){
    //        System.out.println("After Logging");
    //    }

    //    @Around("execution(* com.example.javaspring.JavaSpringApplication.Main.*(..))")
    //    public  Object loggingAround(ProceedingJoinPoint joinPoint) throws Throwable{
    //        System.out.println("Around Before ");
    //
    //        var result = joinPoint.proceed();
    //
    //        System.out.println("Around After ");
    //         return result;
    //    }

    @AfterThrowing( "PointCutMethod()")
    public  void loggingAfterThrowing(){
        System.out.println("Logging the exception");
    }

    @AfterReturning("execution(* com.example.javaspring.AOP.Main.*(..))")
    public  void loggingAfterReturning(){
        System.out.println("Log - method returned ");
    }

}
