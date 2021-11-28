package com.company;

@interface Day{
    //your own annotation
    int tithi() default 0;
}
@Day(tithi =0)
class Wednesday{
    String day="diwali";
}
public class annotation {
    public static void main(String[] args) {


    }
}
