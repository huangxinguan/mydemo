package com.mydemo.leetcode;
/**
 * 二分查找 162寻找峰值
 * @author paic
 *
 */
public class leetCode041 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		findPeakElement(nums);	
	}
	public static int findPeakElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while(right > left) {
			int mid = (left + right) / 2;
			if(nums[mid] > nums[mid+1]) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}
}
