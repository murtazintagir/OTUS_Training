package ru.murtazin.homeworks.homework11.task41;

/**
 * ДЗ (41)
 * Реализуйте метод, который принимает строку с пробелами и возвращает количество слов в этой строке.
 */
public class TypesTaskWordCount {
    public static int wordCount(String input) {
        if (input.equals("")) {
            return 0;
        } else {
            String[] words = input.split(" ");
            return words.length;
        }
    }

    private TypesTaskWordCount() {

    }

    public static void main(String[] args) {
        System.out.println(
                "В этой строке пять слов: " +
                        wordCount("В этой строке пять слов: ")
        );
        System.out.println(
                "В этой строке пять слов: " +
                        wordCount("")
        );
    }
}
