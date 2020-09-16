package com.icbc.algorithms;


/**
 * @Auther: XDragon
 * @Date: 2020/9/10/010 15:34
 * @Description: 167. Two Sum II - Input array is sorted (Easy)
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 * <p>
 * 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 * 如果 sum > target，移动较大的元素，使 sum 变小一些；
 * 如果 sum < target，移动较小的元素，使 sum 变大一些。
 * 数组中的元素最多遍历一次，时间复杂度为 O(N)。只使用了两个额外变量，空间复杂度为 O(1)。
 */
public class DoublePoint {

    static int[] res;
    static int[] numbers = {2, 7, 11, 15};

    //推荐答案
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        if (numbers.length <= 0) {
            return null;
        } else {
            while (i < j) {//避免死循环 保证数据不会溢出
                if (target == numbers[i] + numbers[j]) {
                    res = new int[]{i + 1, j + 1};
                }
                if (numbers[i] + numbers[j] < target) {
                    i++;//小数右移
                } else {
                    j--;//大数左移
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(numbers, 13);
        if (ints == null) {
            System.out.println("不存在正确的结果");
        } else {
            System.out.println("结果是" + ints[0] + "和" + ints[1]);
        }
    }

//    public static int[] twoSum(int[] numbers, int target) {
//        int i = 0;
//        int j = numbers.length - 1;
//        if (numbers.length <= 0) {
//            return null;
//        } else {
//            while ((numbers[i] + numbers[j] != target) && (i < j)) {//如果不等于
//                if (numbers[i] + numbers[j] < target) {
//                    i++;//小数右移
//                } else {
//                    j--;//大数左移
//                }
//            }
//
//        }
//        res = new int[]{i + 1, j + 1};
//        return res;
//    }
}
