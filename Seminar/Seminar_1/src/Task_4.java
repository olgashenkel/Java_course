package src;// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//максимальное количество подряд идущих 1.

public class Task_4 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
//                if (count > maxCount) {
//                    maxCount = count;
//                }
//                maxCount = count > maxCount ? count : maxCount;   // тернарный оператор
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
