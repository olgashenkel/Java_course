import java.util.Scanner;

public class Main_16 {
    public static void main(String[] args) {

// *********************************
// Java: Возврат из циклов
// *********************************

// Работа с циклами обычно сводится к двум сценариям:
//
//!!!Агрегация!!! — накопление результата во время итераций и работа с ним после цикла.
// Переворот строки как раз относится к такому варианту

//!!!Выполнение цикла до достижения необходимого результата и выход!!!.
// Например, задача поиска простых чисел. Вспомним, что простое число делится без остатка
// только на себя и на единицу

//Рассмотрим простой алгоритм проверки простоты числа.
// Попробуем поделить искомое число x на все числа из диапазона от двух до x - 1 и смотреть
// остаток от деления. Если в этом диапазоне не найден делитель, который делит число x без остатка,
// значит перед нами простое число.
//
//Можно заметить, что достаточно проверять числа не до x - 1, а до половины числа.
// Например, 11 не делится на 2, 3, 4, 5. Но и дальше гарантированно не будет делиться
// на числа больше своей половины.
//
//Значит, можно провести небольшую оптимизацию и проверять деление только до x / 2:
//
//public static boolean isPrime(int number) {
//    if (number < 2) {
//        return false;
//    }
//    var divider = 2;
//    while (divider <= number / 2) {
//        if (number % divider == 0) {
//            return false;
//        }
//        divider++;
//    }
//    return true;
//}
//
//App.isPrime(1); // false
//App.isPrime(2); // true
//App.isPrime(3); // true
//App.isPrime(4); // false

//Алгоритм построен таким образом, что если во время последовательного деления на числа
// до x / 2 находится хоть одно, которое делит без остатка, то переданный аргумент — не простое число,
// а значит дальнейшие вычисления не имеют смысла. В этом месте стоит возврат false.
//
//И только если цикл отработал целиком, можно сделать вывод, что число — простое,
// так как не было найдено ни одного числа, которое делит число без остатка.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = in.nextLine();
        System.out.print("Введите символ для поиска в исходном слове: ");
        String str_1 = in.nextLine();
        char ch = str_1.charAt(0);
        System.out.println(hasChar(str, ch));

        in.close();

    }

// Задание 1.
//Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра),
// содержит ли строка указанную букву. Метод принимает два параметра:
//  Строка
//  Буква для поиска

//App.hasChar("Renly", 'R'); // true
//App.hasChar("Renly", 'r'); // false
//App.hasChar("Tommy", 'm'); // true
//App.hasChar("Tommy", 'd'); // false

    public static boolean hasChar(String str, char ch) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}