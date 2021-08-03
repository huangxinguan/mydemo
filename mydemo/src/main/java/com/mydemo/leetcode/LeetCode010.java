package com.mydemo.leetcode;

import java.util.Arrays;

public class LeetCode010 {
	public static void main(String[] args) {
		int[] a = {0,1,0,3,12};
		moveZeroes(a);
		System.out.println(Arrays.toString(a));
	}
	public static void moveZeroes(int[] nums) {
		int zeroeNum = 0;
		int n = nums.length;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				zeroeNum++;
			}
			
			if(zeroeNum > 0 && nums[i] != 0) {
				nums[i - zeroeNum] = nums[i];
			}
		}
		for(int i = 0; i < zeroeNum; i++) {
			nums[n - i - 1] = 0;
		}
	}

	private static void move(int[] nums, int start, int end) {
		for(int i = start; i < end + 1; i++) {
			nums[i - 1] = nums[i];
		}
	}
}
