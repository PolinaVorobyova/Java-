package Lesson5;

public class Lesson5Task2 {
/**
 * Дано целое число, определить является ли последня цифра числа 3
 */

    public static void main(String[] args) {
        int val = 912313;
        if (val % 10 == 3) {
            System.out.println("Число заканчивается на 3");
        } else {
            System.out.println("Число заканчивается не на 3");
        }

    }
}
