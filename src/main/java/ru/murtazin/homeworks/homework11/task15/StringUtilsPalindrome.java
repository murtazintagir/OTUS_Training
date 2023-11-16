package ru.murtazin.homeworks.homework11.task15;

/**
 * ДЗ (15)
 * Реализовать метод, который проверяет что переданная на вход строка является палиндромом
 * (то есть читается одинаково в обоих направлениях).
 * Примеры строк-палиндромов: шалаш; доход; заказ; Лёша на полке клопа нашёл
 * Все знаки препинания, цифры и специальные символы должны игнорироваться методом в вычислении палиндрома
 * Если переданная строка состоит только из спецсимволов, то метод должен вернуть false
 */


public class StringUtilsPalindrome {
    public static boolean isPalindrome(String input) {
        String clean = input.replaceAll("[^а-яА-Яa-zA-Z]+", "").toLowerCase();
        if (clean.length() == 0) {
            return false;
        }
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("шалаш"));
        System.out.println("При вводе строки \"!$%\" метод должен вернуть false - " +
                StringUtilsPalindrome.isPalindrome("!$%"));
        System.out.println("При вводе строки \"шал25231аш\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("шал25231аш"));
        System.out.println("При вводе строки \"шал25231аш\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("!#!@#,@шал25231аш!$!$"));
        System.out.println("При вводе строки \"Лёша на полке клопа нашёл\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("Лёша на полке клопа нашёл"));
        System.out.println("При вводе строки \"Лёша на полке клопа нашёл\" метод должен вернуть true - " +
                StringUtilsPalindrome.isPalindrome("Лёша$!@#!# на полке клопа нашёл"));
    }
}
