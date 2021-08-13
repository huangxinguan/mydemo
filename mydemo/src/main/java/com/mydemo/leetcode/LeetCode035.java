package com.mydemo.leetcode;

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 * @author paic
 *
 */
public class LeetCode035 {
	// 2147483648
	//1073741824
	public int reverseBits(int n) {
//		int ans = 2147483648;
		int result = 0;
		while(n > 0) {
			result += (n % 2) * ans;
			n >>= 1;
			ans >>= 1;
		}
		return result;
	}
}
