package com.icbc.algorithms.leetcode.editor.cn;
//给你一个整数 x ，如果 x 是一个回文整数，返回 ture ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 示例 4： 
//
// 
//输入：x = -101
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1385 👎 0

class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
//        System.out.println(solution.isPalindrome(10));
//        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(12321));
        System.out.println(solution.isPalindrome(1));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean isPalindrome(int x) {//究极版本

            if ((x < 0) || ((x % 10 == 0) && (x != 0))) {//负数 10整数倍都不是 但是0是
                return false;
            }

            int revertNum = 0;//存放反转后的对半数
            while(revertNum<x){//判断 x 是不是小于 revertNum ，当它小于的时候，说明数字已经对半或者过半了
//                int y = ;//最低位数字是10
                revertNum = revertNum * 10 + x % 10;//将最低的数字加到取出数的末尾：revertNum = revertNum * 10 + y
                x = x / 10;//每取一个最低位数字，x 都要自除以 10
            }
            return (revertNum == x)|| (revertNum / 10 == x);//当revertNum!=x（数字长度是偶数） 并且revertNum/10 !=x（数字长度是奇数）
        }

//        public boolean isPalindrome(int x) {
//            if ((x == 0) || (x == 1)) {//0-9都是
//                return true;
//            }
//            if(x%10==0){//10整数倍都不是
//                return  false;
//            }
//
//            int revertNum = 0;//存放反转后的对半数
//            while(revertNum<x){//判断 x 是不是小于 revertNum ，当它小于的时候，说明数字已经对半或者过半了
//                int y = x % 10;//最低位数字是10
//                revertNum = revertNum * 10 + y;//将最低的数字加到取出数的末尾：revertNum = revertNum * 10 + y
//                x = x / 10;//每取一个最低位数字，x 都要自除以 10
//            }
//            if((revertNum == x)|| (revertNum / 10 == x)) {//当revertNum!=x（数字长度是偶数） 并且revertNum/10 !=x（数字长度是奇数）{
//                return true;
//            }
//            return false;
//        }

//        public boolean isPalindrome(int x) { //String版本
//            if (x < 0) {
//                return false;
//            }
//            String s = String.valueOf(x);
//            StringBuffer sb=new StringBuffer(s).reverse();
//            if (s.equals(sb.toString())) {
//                    return true;
//            }
//            return false;
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}