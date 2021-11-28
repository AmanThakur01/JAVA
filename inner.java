package com.company;

public class inner {
    public static void main(String[] args) {
//        B b = new B() {
        B b = () -> {
            System.out.println("b interface");
        };
    }
}

@FunctionalInterface        // only 1 function available
interface B {
    void show();
}