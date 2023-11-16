package ru.murtazin.homeworks.homework11.task39;

/**
 * ДЗ (39)
 * Реализуйте метод, который принимает символ и проверяет, является ли этот символ числом.
 */
public class TypesTaskIsDigit {
    public static boolean isDigit(char input) {
        return Character.isDigit(input);
    }

    private TypesTaskIsDigit() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе символа \"=\" метод должен вернуть false - '"
                        + TypesTaskIsDigit.isDigit('=')
                        + "'"
        );
    }
}
