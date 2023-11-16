package ru.murtazin.homeworks.homework11.task18;

import java.util.Arrays;

/**
 * ДЗ (18)
 * Реализуйте метод, который считает количество упоминаний указанного слова в строке
 * Пример countWord(""Test string for test"", test) должен вернуть 2
 */

public class StringUtilsCountWord {
    public static int countWord(String input, String word) {
        input = input.replaceAll("[^а-яА-Яa-zA-Z]+", " ")
                .strip();
        String[] arr = input.split(" ");
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals(word)) {
                num++;
            }
        }
        return num;
    }

    private StringUtilsCountWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test string for test\" и искомом слове \"test\" метод должен вернуть 2 - "
                + StringUtilsCountWord.countWord("Test string for test", "test"));
    }
}
