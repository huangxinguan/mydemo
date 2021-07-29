package com.mydemo.leetcode;

import java.util.Arrays;

public class LeetCode009 {
	public static void main(String[] args) {
		int[] a = {-1, -100, 3, 99};
		rotate(a, 2);
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k -1);
		reverse(nums, k, nums.length - 1);
		
	}
	
	private static void reverse(int[] nums, int start, int end) {
		while(end > start) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start++;
			end--;
		}
	}
}
