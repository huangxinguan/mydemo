package com.mydemo.leetcode;

/**
 * 二分查找 在排序数组中查找元素的第一个和最后一个位置
 * @author paic
 *
 */
public class LeetCode037 {
	
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] searchRange = searchRange(nums, target);
		System.out.println("hello");
	}
	
	public static int[] searchRange(int[] nums, int target) {
       int[] result = new int[2];
       result[0] = binSearch(nums, target, true);
       result[1] = binSearch(nums, target, false);
       return result;
    }
	
	public static int binSearch(int[] nums, int target, boolean flag) {
		if(nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length;
		int mid;
		int res = -1;
		while(end >= start) {
			mid = (start + end) / 2;
			if(nums[mid] > target) {
				end = mid - 1;
			}else if(nums[mid] < target) {
				start = mid + 1;
			}else {
				res = mid;
				//左边
				if(flag) {
					end = mid - 1;
				}else {  //右边
					start = mid + 1;
				}
			}
		}
		return res;
	}
}
