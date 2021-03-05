package com.icbc.algorithms;

/**
 * Fibonacci 斐波那契数列 力扣509
 *
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/3/5/005 22:31
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n >= 1) {
            if ((1 == n) && (2 == n)) {
                return 1;
            } else {
                int begin = 1;//一开始存放 fib(1) f(n-1)
                int end = 1;//存放fib(2) f(n)
                for (int i = n; i >= 3; i--) {
                    int sum = begin + end;//存放f(n)的结果
                    begin = end;//begin 左移变成下一个
                    end = sum;//把上一步的结果赋值给end
                }
                return end;
            }
        }
        return 0;//小于等于0返回0
    }

//    public static int fib(int n) {//方法1递归 效率差
//        if (n >= 1) {
//            if (1 == n) {
//                return 1;
//            } else {
//                return fib(n - 1) + fib(n - 2);//递归调用
//            }
//        }
//        return 0;//小于等于0返回0
//    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
