package lesson4;

public class P10 {
    public static void main(String[] args) {
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        String string = "Посмотрите как Рите нравится ритм";
        int index = 0;

        for (int i = 0; i < string.length(); i = i + 1)
        {
            if (string.indexOf("рит", i)!=-1)
            {
                index = string.toLowerCase().indexOf("рит", i);
                i = index + 1;
                System.out.println(index);
            }
        }
    }
}



