package lesson4;

public class P3 {
    public static void main(String[] args) {
        //Необходимо вывести минимальное значение массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение " +min);
    }
}
