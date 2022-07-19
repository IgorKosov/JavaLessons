package lesson3;

import java.util.Scanner;

public class P3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int result;
        result = a;
        if (result > 10) {
            System.out.println("Больше 10");
        }
        if (result < 100) {
            System.out.println("Меньше 100");
        }
        if (result / 2.0 > 20) {
            System.out.println("Истина");
        }
        if (result >= 5 && result <= 40) {
            System.out.println("Правда");
        }
        if (result < 5 || result > 40) {
            System.out.println("Ложно");
        }
    }
}
