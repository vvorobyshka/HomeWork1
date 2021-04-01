package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int dayOfBirthday = 14;
        int monthOfBirthday = 7;
        int yearOfBirthday = 2002;
        int sum = dayOfBirthday+monthOfBirthday+yearOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

        boolean monthBiggerDay = dayOfBirthday<monthOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

        char [] arr = new char[5];
        arr[0] = 'H';
        arr[1] = 'a';
        arr[2] = 'n';
        arr[3] = 'n';
        arr[4] = 'a';
        System.out.println("Массив с моим именем: " + new String(arr));

        double myAge = 18.0;
        double partOfYear = 8.0/12.0;

        System.out.println("Мне: " + (myAge + partOfYear));
    }
}