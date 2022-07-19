package lesson3;

public class P6 {
    public static void main(String[] args) {
        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            for (int a = 40; a <= 60; a = a + 4) {
                {
                    System.out.println(a);
                }
            }
        }
    }
}