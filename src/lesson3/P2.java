package lesson3;

import java.util.Scanner;

public class P2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result;
        result = a+b;
        if ( result % 2 == 0 ) {
            System.out.println("maybe a and b are even");
        }
        else {
            System.out.println("some variable is odd");
        }
    }
}
