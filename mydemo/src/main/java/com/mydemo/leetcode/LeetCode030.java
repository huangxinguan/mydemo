package com.mydemo.leetcode;

/**
 * 动态规划 爬电梯
 * 
 * @author paic
 *
 */
public class LeetCode030 {
	public int climbStairs(int n) {
		int result = 0;
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		int b = 2;
		int a = 1;
		for(int i = 3; i <= n; i++) {
			
			result = b + a;
			a = b;
			b = result;
			
		}
		return result;
	}
}
