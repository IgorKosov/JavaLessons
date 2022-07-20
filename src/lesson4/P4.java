package lesson4;

public class P4 {
    public static void main(String[] args) {
        //необходимо вывести среднее арифметическое всех значений массива.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 0;
        for (int i = 0; i < array.length; i++ ) {
            sum = sum + array[i];
        }
        double result = sum / array.length;
        System.out.println("Среднее арифметическое " +result);
        }
}