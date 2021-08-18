package com.mydemo.leetcode;

/**
 * 动态规划 打家劫舍
 * @author paic 
 *
 */
public class LeetCode031 {
	public int rob(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		if(nums.length == 2) {
			return max(nums[0], nums[1]);
		}
		int result = 0;
		int a = nums[0];
		int b = max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i++) {
			result = max(b, a + nums[i]);
			a = b;
			b = result;
		}
		return result;
    }
	
	private int max(int a, int b) {
		return a > b ? a : b;
	}
}
