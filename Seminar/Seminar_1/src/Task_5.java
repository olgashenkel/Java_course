package src;// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
//📌 Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
//📌 Таким образом, первые несколько (или все) элементов массива
//должны быть отличны от заданного, а остальные - равны ему.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int val = 8;
        int[] nums = {3, 2, 2, 3, 5, 3, 7, 8, 0, 8, 8, 1, 3, 4, 3};
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            while (nums[rightIndex] == val && leftIndex < rightIndex) {
                rightIndex--;
            }
            if (nums[leftIndex] == val) {
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = val;
            }
            leftIndex++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
