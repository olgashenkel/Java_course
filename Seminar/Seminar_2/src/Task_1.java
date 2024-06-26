/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */

public class Task_1 {
    public static void main(String[] args) {

        int n = 100_000;
        char c1 = 'A';
        char c2 = 'B';
        long start = System.currentTimeMillis();
        alternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start); // подсчет времени

        start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

    }

// 1-ый способ:
    public static String alternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str = str + c1 + c2;    // чтобы символы складывались как символы, а не по номеру значения char, в Java следует прописать данную операцию полностью, а не заменять её на str += c1 + c2
        }
        return str;
    }

// 2-ой способ через StringBuilder:
    public static String alternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n); // если скобки в StringBuilder() оставить пустыми, то по умолчанию создастся строка из 16-ти символов. Можно добавить нужное количество значений (т.е. выделить память на необходимое количество символов).
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);    // чтобы символы складывались как символы, а не по номеру значения char, в Java следует прописать данную операцию необходимое количество раз, в зависимости сколько символов нужно соединить
        }
        return sb.toString(); // с помощью .toString() приводим данные к типу String
    }

}