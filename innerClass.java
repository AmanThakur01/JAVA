package com.company;

class A {
    int i;

    class B {
        int j;
    }
}

public class innerClass {
    public static void main(String[] args) {
        A a = new A();
        a.i = 5;
        A.B b = a.new B();
        b.j = 12;
    }
}
