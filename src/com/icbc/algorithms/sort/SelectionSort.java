package com.icbc.algorithms.sort;

/**
 * 选择排序
 * 从序列中找出最大的那个元素，然后与最末尾的元素交换位置
 * ✓ 执行完一轮后，最末尾的那个元素就是最大的元素
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/3/7/007 22:33
 */
public class SelectionSort {

    public static int[] selectionSort(int[] nums) {

        if ((null != nums) && nums.length >= 1) {
            int length = nums.length;//获取数组长度

            for (int end = length - 1; end > 0; end--) {// 倒序遍历确保end存放当前的最大值
                int max = 0;//初始化最大值信息 将最大值放最后面
                //下标begin从1开始遍历,把对应最大值的begin放到end
                for (int begin = 1; begin <= end; begin++) {
                    if (nums[begin] > nums[max]) {//如果begin比较大
                        max = begin;//begin赋值给max
                    }
                }
                int tmp = nums[max];//存放最大值
                nums[max] = nums[end];//将最后面的值赋值给max 然后用于后面比较
                nums[end] = tmp;//将最大值放到后面
            }

            return nums;
        }

        return null;

    }


    public static void main(String[] args) {
        System.out.println(selectionSort(null));
        int[] a ={1, 3, 2, 6, 5};
        int[] ints = selectionSort(a);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+",");
        }
    }

}
