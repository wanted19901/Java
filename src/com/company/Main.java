package com.company;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {
    private static void print(String s) {              //Метод для упрощения вывода результата на экран
        System.out.println(s);
    }

    public static void main(String[] args) {


        print("ВВедите а ");
        Scanner scanA = new Scanner(System.in);
        int numA = scanA.nextInt();
        print("ВВедите B ");
        Scanner scanB = new Scanner(System.in);
        int numB = scanB.nextInt();
        print("ВВедите действие ");
        Scanner scanZnac = new Scanner(System.in);
        String znak = scanZnac.nextLine();
        String sum = "+";
        String minus = "-";
        String umnoj = "*";
        String delen = "/";
        if (znak.equals(sum)) {
            print("Результат " + numA + znak + numB + "=" + (numA + numB));
        } else if (znak.equals(minus)) {
            print("Результат " + numA + znak + numB + "=" + (numA - numB));
        } else if (znak.equals(umnoj)) {
            print("Результат " + numA + znak + numB + "=" + (numA * numB));
        } else if (znak.equals(delen)) {
            print("Результат " + numA + znak + numB + "=" + (numA / numB));

        } else print("Неверная команда");
    }
}






