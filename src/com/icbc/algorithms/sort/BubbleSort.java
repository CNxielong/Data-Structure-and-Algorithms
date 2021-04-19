package com.icbc.algorithms.sort;

/**
 * 冒泡排序
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/3/7/007 1:39
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {
        if ((null != nums) && nums.length >= 1) {
            int length = nums.length;
            for (int i = 0; i < length; i++) {//a[i]左边 放比较小的数
                for (int j = i + 1; j < length; j++) {//a[j]右边 放比较大的数
                    if (nums[i] > nums[j]) {//如果左边的数比较大 就借助temp交换位置
                        int temp = nums[i];//存放比较大的数
                        nums[i] = nums[j];//比较小的数放左边
                        nums[j] = temp;//比较大的数放右边
                    }
                }
            }
            return nums;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(bubbleSort(null));
        int[] a ={1, 3, 2, 6, 5};
        int[] ints = bubbleSort(a);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+",");
        }

    }
}
