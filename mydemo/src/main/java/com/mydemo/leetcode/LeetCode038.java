package com.mydemo.leetcode;

/**
 * 二分查找 搜索旋转排序数组
 * @author paic
 *
 */
public class LeetCode038 {
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while(right >= left) {
			int mid = (left + right) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[right] > nums[mid]) {
				if(target > nums[mid] && target < nums[right]) {
					left = mid + 1;
				}else {
					right = mid - 1;
				}
			}else {
				if(target < nums[mid] && target > nums[left]) {
					right = mid - 1;
				}else {
					left = mid + 1;
				}
			}
		}
		return -1;
	}
}
