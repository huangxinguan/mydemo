package com.mydemo.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * @author paic
 *
 */
public class LeetCode036 {
	public int singleNumber(int[] nums) {
		int result = nums[0];
		for(int i = 1; i < nums.length; i++) {
			result ^= nums[i];
		}
		return  result;
	}
}
