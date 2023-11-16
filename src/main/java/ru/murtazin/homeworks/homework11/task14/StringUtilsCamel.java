package ru.murtazin.homeworks.homework11.task14;


import java.util.Arrays;

/**
 * ДЗ (14)
 * Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации.
 * Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены.
 * Пример: входная строка - my camel * case string 1, результат - myCamelCaseString
 */


public class StringUtilsCamel {
    public static String toCamelCase(String input) {
        input = input.replaceAll("[^а-яА-Яa-zA-Z]+", " ")
                .strip();
        String[] arr = input.split(" ");
        StringBuilder newInput = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }
        for (int i = 0;i < arr.length; i++) {
            newInput.append(arr[i]);
        }
        return newInput.toString();
    }

    private StringUtilsCamel() {

    }

    public static void main(String[] args) {
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("my camel * case string 1"));
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("$my camel * case string 1"));
    }
}
