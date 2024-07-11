import java.util.Arrays;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {


        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        System.out.println(w1); // Worker@3feba861 --> хэш-код
        System.out.println(w2); // Worker@5b480cf9 --> хэш-код
        System.out.println(w4); // Worker@6f496d9f --> хэш-код

        System.out.println(w1.firstName);   // Имя_1
        System.out.println(w2.firstName);   // Имя_2
        System.out.println(w4.firstName);   // Имя_1

        System.out.print("\nСравнение данных через знак равенства 'w1 == w4'. \nРезультат --> ");
        System.out.println(w1 == w4);       // false
        System.out.print("\nСравнение данных через equals 'w1.equals(w4)'. \nРезультат --> ");
        System.out.println(w1.equals(w4));  // true

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3)); // наполняем массив первыми тремя элементами
        System.out.print("\nПроверяем массив на содержание четвертого элемента с помощью метода '.contains(w4)'. \nРезультат --> ");
        System.out.println(workers.contains(w4));   // проверяем массив на содержание четвертого элемента

    }


}
