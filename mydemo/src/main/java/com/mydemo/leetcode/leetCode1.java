package com.mydemo.leetcode;

public class leetCode1 {
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(searchInsert(nums, 0));
	}
	
	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length;
		while(start < end ) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		
		return start;
	}
}
