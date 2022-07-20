package lesson4;

public class P9 {
    public static void main(String[] args) {
        //необходимо подсчитать количество букв “е” в строке.
        String s = "Перевыборы выбранного президента";
        int summ = 0;
        for (int j = 0; j < s.length(); j = j + 1){
            if (s.charAt(j) == 'е') {
                summ = summ + 1;
            }
        }
        System.out.println(summ);
    }
}
