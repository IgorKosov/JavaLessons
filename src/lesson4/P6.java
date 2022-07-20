package lesson4;

public class P6 {
    public static void main(String[] args) {
        //необходимо вывести максимальное значение массива.
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = max + array[i].length;
        }
        System.out.println(max);
    }
    }