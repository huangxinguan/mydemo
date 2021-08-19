package com.mydemo.leetcode;

/**
 * 713. 乘积小于K的子数组  滑动窗口
 * @author paic
 *[10,5,2,6]
 */
public class LeetCode049 {
	public static void main(String[] args) {
		int[] nums = {10, 5, 2, 6};
		numSubarrayProductLessThanK2(nums, 100);
	}
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		dp[0] = nums[0] < k ? 1 : 0;
		for(int i = 1; i < nums.length; i++) {
			int sum = nums[i];
			dp[i] = nums[i] < k ? dp[i-1] + 1 : dp[i-1];
			for(int j = i - 1; j >= 0; j--) {
				sum *= nums[j];
				if(sum < k) {
					dp[i]++;
				}else {
					break;
				}
			}
		}
		return dp[nums.length - 1];
    }
	
	public static int numSubarrayProductLessThanK2(int[] nums, int k) {
		if(k == 0) {
			return 0;
		}
		int sum = 1;
		int result = 0;
		int left = 0;
		for(int i = 0; i < nums.length; i++) {
			sum *= nums[i];
			while(sum >= k) {
				sum /= nums[left++];
			}
			result += i - left + 1;
				
				
			
		}
		return result;
	}
}	
