// Задание № 0.
// 📌 Даны следующие строки, cравнить их с помощью == и
//метода equals() класса Object
//📌 String s1 = "hello";
//📌 String s2 = "hello";
//📌 String s3 = s1;
//📌 String s4 = "h" + "e" + "l" + "l" + "o";
//📌 String s5 = new String("hello");
//📌 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

public class Task_1 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
// == и equals - особенность java, для ссылочных типов они работают по-разному.
// == сравнивает ссылки (место расположения объекта и его содержимое). Даже если содержимое одинаково, а ссылки разные выдаст результат false
// equals - метод класса Object, реализован для сравнения ссылок на объекты. Для сравнения строк лучше использовать его, а не == (если содержимое ссылок одинаковое, а ссылки разные выдаст true)

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        System.out.println();

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));

        System.out.println();

        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));

        System.out.println();

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}