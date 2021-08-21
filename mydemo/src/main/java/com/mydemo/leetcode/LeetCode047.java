package com.mydemo.leetcode;

/**
 * 贪心 双指针 11. 盛最多水的容器
 * 
 * @author paic
 *
 */
public class LeetCode047 {
	public static void main(String[] args) {
		int[] a = {1,3,2,5,25,24,5};
		maxArea(a);
	}
	public static int maxArea(int[] height) {
		if(height.length < 2) {
			return 0;
		}
		int n = height.length;
		int left = 0;
		int right = n - 1;
		int max = (right - left) * Math.min(height[left], height[right]);
		while(right > left) {
			int a = (right - left - 1) * Math.min(height[left+1], height[right]);
			int b = (right - left - 1) * Math.min(height[left], height[right-1]);
			if(a > b) {
				right--;
				max = Math.max(max, a);
			}else {
				left++;
				max = Math.max(max, b);
			}
		}
		return max;
	}
}
