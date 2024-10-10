package com.example.javaspring.AOP;

import org.springframework.stereotype.Component;

@Component
public  class Main {

    public void Hello(){
        System.out.println("Hello World");
    }

    //Main(){
    //    System.out.println("Main Constructor");
    //}

    public void method1() {
        this.Hello();
        System.out.println("Method 1 is running!");
    }

    public void method2() {
        System.out.println("Method 2 is running!");
    }


    public void method3() {

        try{
            int a = 1 / 9;
            System.out.println("Method 3 is running!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void test() {
        method3();
    }
}
