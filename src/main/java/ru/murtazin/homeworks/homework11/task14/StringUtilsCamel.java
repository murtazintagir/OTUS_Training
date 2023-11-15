package ru.murtazin.homeworks.homework11.task14;

/**
 * ДЗ (14)
 * Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации.
 * Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены.
 * Пример: входная строка - my camel * case string 1, результат - myCamelCaseString
 */


public class StringUtilsCamel {
    public static String toCamelCase(String input) {
// TODO
        return "";
    }

    private StringUtilsCamel() {

    }

    public static void main(String[] args) {
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("my camel * case string 1"));
    }
}
