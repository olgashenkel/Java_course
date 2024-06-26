/*
Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3c1d2
 */

public class Task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String newStr = coressString(str);
        System.out.println(newStr);


    }

    public static String coressString(String str) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        char currentChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == currentChar) {
                count++;
            } else {
                res.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        res.append(currentChar).append(count);
        return res.toString();
    }
}
