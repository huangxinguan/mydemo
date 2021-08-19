package com.mydemo.leetcode;

/**
 * 209. 长度最小的子数组 滑动窗口
 * @author paic
 *
 */
public class LeetCode050 {
	public int minSubArrayLen(int target, int[] nums) {
		if(target <= 1) {
			return 0;
		}
		int l = 0;
		int sum = 0;
		int min = nums.length + 1;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while(sum >= target) {
				min = Math.min(min, i - l + 1);
				sum -= nums[l++];
			}
		}
		return min == nums.length + 1 ? 0 : min;
    }
}
