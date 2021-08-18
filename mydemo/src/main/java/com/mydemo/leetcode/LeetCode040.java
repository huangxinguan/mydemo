package com.mydemo.leetcode;

/**
 * 二分查找  153、寻找旋转排序数组中的最小值
 * @author paic
 *
 */
public class LeetCode040 {
	
	public static void main(String[] args) {
		int[] nums = {4,5,1,2,3};
		findMin(nums);
	}
	public static int findMin(int[] nums) {
		int target = -5001;
		int left = 0;
		int right = nums.length - 1;
		while(right >= left) {
			int mid = (left + right) / 2;
			if(nums[mid] >= nums[left] && nums[right] >= nums[mid]) {
				return nums[left];
			}
			if(nums[right] > nums[mid] && nums[mid] < nums[left]) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
	
		return nums[left];
    }
}
