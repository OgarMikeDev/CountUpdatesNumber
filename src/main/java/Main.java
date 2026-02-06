import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Введите кол-во изменений:");
        int countUpdates = new Scanner(System.in).nextInt();
        System.out.println("Введите число:");
        int number = new Scanner(System.in).nextInt();

        /*
        TODO
         Напр-р,
         countUpdates - 1,
         number - 85.
         1 случай.
         Т.к. одно изменение, работаем только с 8,
         т.е. оно превращается в 1(9 - 8) и т.к.
         является десятой частью,
         к нему прибавляется 0,
         т.е. 85 -> 10
         */
        //TODO Кол-во нулей равно кол-ву символов в числе - 1
        int countZero = String.valueOf(number).length() - 1;
        int valueUpdate = 0;
        for (int actualCountUpdates = 0; actualCountUpdates < countUpdates; actualCountUpdates++) {
            /*
            TODO
             85 -> "85" -> (char) '8' -> "8" -> 8
             */
            int firstSymbol = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(actualCountUpdates)));
            int difference = 9 - firstSymbol;
            /*
            TODO
             1 -> "1" -> "10" -> 10
             */
            int endNumber = Integer.parseInt(String.valueOf(difference) + "0".repeat(countZero));
            valueUpdate += endNumber;
            countZero--;
        }
        System.out.println("Результат: " + valueUpdate);
    }
}
