package com.mydemo.leetcode;

import java.util.Arrays;

public class LeetCode011 {
	public static void main(String[] args) {
		int[] nums = {3,24,50,79,88,150,345};
		int[] twoSum = twoSum(nums, 200);
		System.out.println(Arrays.toString(twoSum));
	}
	public static int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;
		int[] result = null;
		while(j > i) {
			if(nums[i] + nums[j] == target) {
				result = new int[] {i+1, j+1};
				return result;
			}else if(nums[i] + nums[j] > target){
				j--;
			}else {
				i++;
			}
		}
		return result;
	}

	private int binarySearch(int[] nums, int start, int end, int target) {
		end++;
		while(start < end) {
			int mid = (start + end) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		
		return -1;
	}
}
