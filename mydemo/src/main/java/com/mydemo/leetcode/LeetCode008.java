package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode008 {
	public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int i = 0;
		int j = nums.length - 1;
		int k = nums.length - 1;
		while(j > i) {
			int a = nums[i] * nums[i];
			int b = nums[j] * nums[j];
			if(a > b) {
				i++;
			}else {
				j--;
			}
			result[k--] = a > b ? a : b;
			
		}
		return result;
    }
}
