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
        String[] array = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            sb.append(array[i]);
            sb.append(" ");
        }
        sb.append(array[0]);
        return sb.toString().equals(input);
    }

    private StringUtilsPalindrome() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"шалаш\" метод должен вернуть true - " + StringUtilsPalindrome.isPalindrome("шалаш"));
    }
}
