package ru.murtazin.homeworks.homework11.task9;

/** ДЗ (9)
 * Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок. Необходимо реализовать метод,
 * который проверяет что в строке у каждой открывающей скобки есть соответствующая ей закрывающая скобка.
 * Строка в которой закрывающая скобка идёт впереди открывающей является некорректной.
 * Например (()) - корректная строка, ()) - некорректная строка
 */

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        if (null == input || ((input.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = input.toCharArray();
            for (char c : ch) {
                if (!(c == bracketOpenSymbol || c == bracketCloseSymbol)) {
                    return false;
                }
            }
        }
        while (input.contains("()") || input.contains("[]") || input.contains("{}")) {
            input = input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (input.length() == 0);
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}
