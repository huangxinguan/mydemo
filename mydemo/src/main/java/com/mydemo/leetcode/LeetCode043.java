package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 双指针 15. 三数之和 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * ？请你找出所有和为 0 且不重复的三元组。
 * 
 * @author paic
 *
 */
public class LeetCode043 {

	public static void main(String[] args) {
		
		int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		List<List<Integer>> threeSum = threeSum(nums);
		List<List<Integer>> threeSum2 = threeSum2(nums);
		List<List<Integer>> threeSum3 = threeSum3(nums);
		
		Integer a = 1;
		Integer b = 1;
		System.out.println(a == b);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<Integer> numsList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}
		numsList.sort((x, y) -> {
			return x.compareTo(y);
		});
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numsList.size(); i++) {
			if(numsList.get(i) > 0) {
				break;
			}
			if (i > 0 && numsList.get(i).intValue() == numsList.get(i - 1).intValue()) {
				continue;
			}
			int left = i + 1;
			int right = numsList.size() - 1;
			while (right > left) {
				int sum = numsList.get(i) + numsList.get(left) + numsList.get(right);
				if (sum > 0) {
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					result.add(Arrays.asList(numsList.get(i), numsList.get(left), numsList.get(right)));
					while (right > left && numsList.get(right).intValue() == numsList.get(right - 1).intValue())
						right--;
					while (right > left && numsList.get(left).intValue() == numsList.get(left + 1).intValue())
						left++;
					left++;
					right--;
				}
			}
		}
		return result;
	}

	public static List<List<Integer>> threeSum2(int[] nums) {
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
		System.out.println(result.size());
		return result;
	}
	
	public static List<List<Integer>> threeSum3(int[] nums) {
		List<Integer> numsList = new ArrayList<>();
		int n = nums.length;
		for(int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}
		numsList.sort((x, y)->{
			return x.compareTo(y);
		});
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == nums[i+1] && numsList.get(i) != numsList.get(i+1)) {
				System.out.println(i);
				System.out.println("nums[i] " + nums[i]);
				System.out.println("numsList.get(i)" + numsList.get(i).intValue());
				System.out.println("numsList.get(i+1)" + numsList.get(i+1).intValue());
			}
		}
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < numsList.size(); i++) {
			if(i > 0 && numsList.get(i) == numsList.get(i-1)) {
				continue;
			}
			int left = i + 1;
			int right = numsList.size() - 1;
			int temp = - numsList.get(i);
			while(right > left) {
				if(right + 1 < n && numsList.get(right) == numsList.get(right+1)) {
					right--;
					continue;
				}
				if(left - 1 > i && numsList.get(left) == numsList.get(left - 1)) {
					left++;
					continue;
				}
				if(numsList.get(left) + numsList.get(right) > temp) {
					right--;
				}else if(numsList.get(left) + numsList.get(right) < temp) {
					left++;
				}else {
					result.add(Arrays.asList(numsList.get(i), numsList.get(left), numsList.get(right)));
					right--;
				}
			}
		}
		System.out.println(result.size());
		return result;
    }

}
