package ru.murtazin.homeworks.homework11.task4;

/**
 * ДЗ (4)
 * Дана строка, состоящая из слов, разделенных пробелами. Необходимо реализовать метод, возвращающий строку,
 * слова в которой записаны в обратном порядке. Например, для строки "test abc" необходимо получить строку "abc test".
 */
public class WordUtils {
    public static String reverseWords(String inputText) {
        String[] array = inputText.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            sb.append(array[i]);
            sb.append(" ");
        }
        sb.append(array[0]);
        return sb.toString();
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}
