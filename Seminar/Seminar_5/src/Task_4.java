// Задача № 3.
// Написать метод, который переведет число из римского формата записи в арабский.
//Например, MMXXIV = 2024
// 'I', 1
//'V', 5
//'X', 10
//'L', 50
//'C', 100
//'D', 500
//'M', 1000

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[]  args) {

        String romanNum = "MMXXIV";
        System.out.println(romanToArabic(romanNum));

    }

    public static Map<Character, Integer> romanArabicMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }

    public static int romanToArabic(String romanNum) {
        Map<Character, Integer> romanMap = romanArabicMap();
        // MMXXIV = 2024
        int result = 0;
        int prevValue = 0;

        for (int i = romanNum.length() - 1; i >= 0 ; i--) {
            int currentValue = romanMap.get(romanNum.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

}
