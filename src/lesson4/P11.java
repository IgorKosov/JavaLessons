package lesson4;

public class P11 {
    public static void main(String[] args) {
        // Необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

         String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
         int str = 0;
            for (int i = 0; i < array.length; i++){
              for (int j = 0; j < array[i].length; j++){
               if (!array[i][j].contains("е")) {
                   str++;
               }
               }
           }
        System.out.println(str);
    }
}