package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 双指针三个数之和 15. 三数之和 
 * @author paic
 *
 */
public class LeetCode044 {
	
	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> threeSum2(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				break;
			}

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = nums.length - 1;
			while (right > left) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum > 0) {
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (right > left && nums[right] == nums[right - 1])
						right--;
					while (right > left && nums[left] == nums[left + 1])
						left++;

					right--;
					left++;
				}
			}
		}
		return result;
	}
}
