package ru.murtazin.homeworks.homework11.task17;

/**
 * ДЗ (17)
 * Дана строка, реализуйте метод, который позволяет получать подстроку по заданным индексам
 * Пример getSlice("Test", 1, 4) - вернёт "est"
 */


public class StringUtilsSliceWord {
    public static String getSlice(String input, int leftEdge, int rightEdge) {
        if (leftEdge > rightEdge){
            return input;
        }
        if (leftEdge < 0){
            return input;
        }
        StringBuilder newInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i >=leftEdge && i <= rightEdge){
                newInput.append(input.charAt(i));
            }
        }
        return newInput.toString();
    }

    private StringUtilsSliceWord() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе строки \"Test\" с индексами 1 и 4 метод должен вернуть \"est\" - "
                + "\"" + StringUtilsSliceWord.getSlice("Test", 1,4) +"\"");

    }
}
