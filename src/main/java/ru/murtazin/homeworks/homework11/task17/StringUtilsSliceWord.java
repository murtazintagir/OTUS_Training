package ru.murtazin.homeworks.homework11.task17;

/**
 * ДЗ (17)
 * Дана строка, реализуйте метод, который позволяет получать подстроку по заданным индексам
 * Пример getSlice("Test", 1, 4) - вернёт "est"
 */


public class StringUtilsSliceWord {
    public static String getSlice(String input, int leftEdge, int rightEdge) {
        return input.substring(leftEdge, rightEdge);
    }

    private StringUtilsSliceWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test\" с индексами 1 и 4 метод должен вернуть \"est\" - "
                + "\"" + StringUtilsSliceWord.getSlice("Test", -1,0) +"\"");

    }
}
