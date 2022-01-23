package ru.skypro;

import java.util.Arrays;

public class Main {

    ///Задача №1
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    private static void printIsLeapYearResult(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    ///Задача №2
    public static int getDeviceOS(String name) {
        if (name.equals("Android")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int getDeviceYear(int y) {
        if (y >= 2015) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void printResultOS(int a, int b) {
        if (a == 0 && b == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (a == 0 && b == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (a == 1 && b == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    ///Задача №3
    public static int getDeliveryDistance(int distance) {
        int daysNumber = 0;
            if (distance < 20) {
            daysNumber = daysNumber + 1;
        }
            if (distance >= 20 && distance < 60) {
                daysNumber = daysNumber + 2;
            }
             if (distance >= 60 && distance < 100) {
                daysNumber = daysNumber + 3;
            }
        return daysNumber;
    }

    ///Задача №4
    public static void searchDouble(String doubles) {
        char[] chars = doubles.toCharArray();
        for (int i = 0; i < doubles.length(); i++) {
            for (int j = i + 1; j < doubles.length() ; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(j + " - символ дублируется с - " + chars[j]);
                    return;
                }
                if (chars[i] != chars[j]) {
                }
            }
        }
        System.out.println("Дублей нет");
    }

    ///Задача №5
    public static void getReverce(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            if (i != 0);
            System.out.print(num[i] + " ");
        }


    }




    public static void main(String[] args) {
        ///Задача №1
        printIsLeapYearResult(2008);

        ///Задача №2
        int year = getDeviceYear(2008);
        int osName = getDeviceOS("IOS");
        printResultOS(year, osName);

        ///Задача №3
        System.out.println("Дней на доставку - " + getDeliveryDistance(95));

        ///Задача №4
        String str = "abcdefg";
        searchDouble(str);

        ///Задача №5
        int[] wum = new int[]{1, 2, 3, 4, 5, 6};
        getReverce(wum);



        }

    }

