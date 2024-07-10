// Задание № 4.

// Написать метод, который переведёт данное целое число в римский формат.
// 1000, "M"
// 900, "CM"
// 500, "D"
// 400, "CD"
// 100, "C"
// 90, "XC"
// 50, "L"
// 40, "XL"
// 10, "X"
// 9, "IX"
// 5, "V"
// 4, "IV"
// 1, "I"

import java.util.*;

public class Task_5_dop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число для перевода в римский формат: ");
        int arabNum = in.nextInt();

        System.out.println(romanToRim(arabNum));


        in.close();

    }

    public static Map<Integer, String> romanRimMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        return map;
    }

    public static String romanToRim(int arabNum) {
        Map<Integer, String> romanMap = romanRimMap();


        String result = "";

        for (int key : romanMap.keySet()) {
//            System.out.println(key);
            while (arabNum >= key && arabNum > 0) {
                result += romanMap.get(key);
//                System.out.println(result);
                arabNum -= key;
//                System.out.println(arabNum);
            }

        }
        return result;
    }

}
