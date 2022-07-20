package lesson4;

public class P1 {
// Необходимо вывести сумму всех значений массива

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
            for (int i = 0; i < array.length; i++ ){
                sum = sum + array[i];
            }
        System.out.println("Сумма массива равна " +sum);
    }
}
