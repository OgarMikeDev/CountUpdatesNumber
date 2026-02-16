import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        TODO
         Первой строкой вводится рекомендуемое кол-во изменений.
         Второй строкой вводится число(сколько угодно чисел через пробел).
         Цель - изменить все введённые числа столько раз,
         сколько ввёл пользователь и вывести самое большое.
         Сколько изменений, столько цифр в числе меняется
         Напр-р,
         1
         85
         меняем 1 цифру -> 8 -> 9 -> 9 - 8 -> 1
         т.к. 8 является десятой частью, к 1 добавляем 0.
         Ответ -> 10
         2
         85
         меняем 1 цифру 8 -> 9 -> 9 - 8 -> 1, + 0 -> 10
         меняем 2 цифру 5 -> 9 -> 9 - 5 -> 4
         10 + 4 -> 14
         Подсказки:
         String[] arrayTextNumbers = "24 13 24 09".split(" ")
         Преобразование числа в текст -> 85 -> String.valueOf(85) "85"
         получение текущего СИМВОЛА -> "85".chatAt(0) -> '8'
         нюанс -> (int) '8' -> 56,
         '8' -> String.valueOf('8') "8"
         Integer.parseInt("8") -> 8
         "0".repeat(4) -> 0000
         Условие цикла ->
         пока текущее кол-во изменений
         меньше введённого пользователем
         */
        System.out.println("Введите кол-во изменений:");
        int countUpdates = new Scanner(System.in).nextInt();
        System.out.println("Введите число для изменения:");
        int inputNumber = new Scanner(System.in).nextInt();

        int countZero = String.valueOf(inputNumber).length() - 1;
        int sum = 0;
        for (int currentCountUpdates = 0; currentCountUpdates < countUpdates; currentCountUpdates++) {
            String textCurrentSymbol = String.valueOf(String.valueOf(inputNumber).charAt(currentCountUpdates));
            int firstSymbol = 9 - Integer.parseInt(textCurrentSymbol);
            int endNumber = Integer.parseInt(String.valueOf(firstSymbol) + "0".repeat(countZero));
            countZero--;
            sum += endNumber;
        }
        System.out.println(sum);
    }
}
