package lesson4;

public class P7 {
    public static void main(String[] args) {
        //необходимо вывести количество элементов в массиве.
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum+=array[i].length;
        System.out.println(sum);
                }
    }