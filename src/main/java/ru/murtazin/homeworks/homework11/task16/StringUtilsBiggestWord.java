package ru.murtazin.homeworks.homework11.task16;

import java.util.Arrays;

/**
 * ДЗ (16)
 * Дана строка, реализовать метод который ищет слово с наибольшим количеством букв.
 * Если таких слов несколько - вывести последнее
 */


public class StringUtilsBiggestWord {
    public static String getLargest(String input) {
        String clean = input.replaceAll("[^а-яА-Я]+", " ");
        String[] inputArr = clean.split(" ");
        System.out.println(Arrays.toString(inputArr));
        int wordLength = 0;
        String maxWord = "";
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].length() >= wordLength) {
                wordLength = inputArr[i].length();
                maxWord = inputArr[i];
            }
        }
        return maxWord;
    }

    private StringUtilsBiggestWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"самое большое слово\" метод должен вернуть \"большое\" - "
                + StringUtilsBiggestWord.getLargest("самое Большое слово"));
        System.out.println("При вводе строки \"самое большое слово\" метод должен вернуть \"большое\" - "
                + StringUtilsBiggestWord.getLargest("большое большое Большое"));
    }
}
