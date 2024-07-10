// Задание № 1.
// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
//и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//некоторую букву во втором слове, при этом
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//порядка следования. (Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true


import java.util.HashMap;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String str_1 = in.nextLine();
        System.out.print("Введите второе слово: ");
        String str_2 = in.nextLine();
        System.out.printf("Сравниваем слова \"%s\" и \"%s\" на изоморфность...\n", str_1, str_2);

        System.out.println(isIzomorphicSee(str_1, str_2));

        in.close();
    }

    public static boolean isIzomorphicSee(String str_1, String str_2) {
        if (str_1.length() != str_2.length()) {
            System.out.printf("Слова \"%s\" и \"%s\" не изоморфны! Результат --> ", str_1, str_2);
            return false;
        }
        if (str_1.equals(str_2)) {
            System.out.printf("Слова \"%s\" и \"%s\" не изоморфны! Результат --> ", str_1, str_2);
            return true;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < str_1.length(); i++) {      // сравниваем первое слово со вторым
            char c1 = str_1.charAt(i);
            char c2 = str_2.charAt(i);

            if (hm.containsKey(c1) && c2 != hm.get(c1)) {      // !hm.containsKey(c1) - если не содержит ...
                System.out.printf("Слова \"%s\" и \"%s\" не изоморфны! Результат --> ", str_1, str_2);
                return false;
            } else {
                hm.put(c1, c2);
            }

            for (int j = 0; j < str_2.length(); j++) {     // !!! Дополнительное задание!!! сравниваем второе слово с первым

                if (hm.containsKey(c2) && c1 != hm.get(c2)) {      // !hm.containsKey(c1) - если не содержит ...
                    System.out.printf("Слова \"%s\" и \"%s\" не изоморфны! Результат --> ", str_1, str_2);
                    return false;
                } else {
                    hm.put(c2, c1);
                }
            }
        }
        System.out.printf("Слова \"%s\" и \"%s\" изоморфны! Результат --> ", str_1, str_2);
        return true;
    }
}
