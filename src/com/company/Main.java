package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hw lesson2 part1");
        int a = 10; //Нач. пробег за день
        int d = 1;  // Увеличение пробега каждый день
        int n = 1;  // Число дней
        int s = 10;      //Суммарный пробег
        int s1;
        {
            System.out.println("Пробег за 1-й день составил:" + a);
            System.out.println("Пробег общий составил:" + s);

        }
        {
            n = 2;
            while ((n - 1) <= 6) {

                a = a + d;
                s = s + a;
                System.out.println("Пробег за день " + n + " составил:" + a);


                System.out.println("Пробег общий составил:" + s);

                n++;
            }
        }
    }
}

