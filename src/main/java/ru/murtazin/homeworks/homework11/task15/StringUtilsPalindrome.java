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
        return false;
    }

    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("шалаш"));
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("!$%"));
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("шал25231аш"));
        String text = "шал25231аш";
        System.out.println(text);
        text = text.replaceAll("[^a-zA-Z]", "");
        System.out.println(text);
    }
}
