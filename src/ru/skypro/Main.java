package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    ///Задача №1
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void printIsLeapYearResult(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    ///Задача №2
    public static void printResultOS(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("облегченную ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }

    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
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
            }
        }
        System.out.println("Дублей нет");
    }

    ///Задача №5
    public static void getReverce(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start++] = num[end];
            num[end--] = temp;
        }

        }







    public static void main(String[] args) {
        ///Задача №1
        printIsLeapYearResult(2008);

        ///Задача №2
        printResultOS(0, 2015);

        ///Задача №3
        System.out.println("Дней на доставку - " + getDeliveryDistance(95));

        ///Задача №4
        String str = "abcdefg";
        searchDouble(str);

        ///Задача №5
        int[] wum = new int[]{1, 2, 3, 4, 5, 6};
        getReverce(wum);
        System.out.println(Arrays.toString(wum));



        }

    }

