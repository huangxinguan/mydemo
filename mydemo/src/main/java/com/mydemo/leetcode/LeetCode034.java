package com.mydemo.leetcode;

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * 
 * @author paic
 *
 */
public class LeetCode034 {
	
	public static void main(String[] args) {
		int i = 3;
		i >>= 1;
		System.out.println(i);
	}

	public int hammingWeight(int  n) {
		int i = 0;
		if (n < 0) {
			i++;
			n = (n & 2147483647);
		}
		while (n > 0) {
			if (n % 2 == 1) {
				i++;
				n--;
			}
			n >>= 1;
		}
		return i;
	}
}
