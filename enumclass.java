package com.company;

public class enumclass {
    enum Day {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        private int i;

        void getData(int j) {
            i = j;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Day.monday);
        Day d = Day.monday;
        d.getData(2);
        switch (d) {
            case friday -> System.out.println(d.i);
        }
    }
}