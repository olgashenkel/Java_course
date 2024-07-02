import java.util.Scanner;

public class Main_14 {
    public static void main(String[] args) {

// *********************************
// Java: Синтаксический сахар
// *********************************
//Подобные конструкции index = index + 1 в Java используются довольно часто,
// поэтому создатели языка добавили сокращенный вариант записи: index += 1.
// Такие сокращения принято называть синтаксическим сахаром, потому что они делают процесс
// написания кода немного проще и приятнее.
//
//Существуют сокращенные формы для всех арифметических операций и для конкатенации строк:
//
//a = a + 1 → a += 1
//a = a - 1 → a -= 1
//a = a * 2 → a *= 2
//a = a / 1 → a /= 1
//a = a + "foo" → a += "foo"


        Scanner in = new Scanner(System.in);
        System.out.print("Введите любою строку: ");
        String str = in.nextLine();
        System.out.print("Введите символ для исключения: ");
        String str_1 = in.nextLine();
        char ch = str_1.charAt(0);
        System.out.println(filterString(str, ch));
    }

// Задание 1.
//Реализуйте статический метод App.filterString(), принимающую на вход строку и символ,
// и возвращающую новую строку, в которой удален переданный символ во всех его позициях.
//
//Пример вызова:
//
//var str = "If I look back I am lost";
//App.filterString(str, 'I'); // "f  look back  am lost"
//App.filterString(str, 'o'); // "If I lk back I am lst"

    public static String filterString(String str, char ch) {
        int i = 0;
        String result = "";
        while (i < str.length()) {
            if (str.charAt(i) != ch) result += str.charAt(i);
            i++;
        }
        return result;
    }

}
