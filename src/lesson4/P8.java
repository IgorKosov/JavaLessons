package lesson4;

public class P8 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }
    }
}