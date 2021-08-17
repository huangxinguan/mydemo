package com.mydemo.leetcode;
/**
 * 搜索二维矩阵 二分查找
 * @author paic
 *
 */
public class LeetCode039 {
	
	public static void main(String[] args) {
		int[][] nums = {{1}, {3}};
		searchMatrix(nums, 3);
		System.out.println(11);
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
		int i = binSearch2(matrix, target);
		if(i < 0 || i > matrix.length - 1) {
			return false;
		}
		boolean flag = binSearch(matrix[i], target);
		return flag;
		
	}
	
	public static boolean binSearch(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while(r >= l) {
			int mid = (l + r) / 2;
			if(nums[mid] == target) {
				return true;
			}else if(target > nums[mid]) {
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		return false;
	}
	public static int binSearch2(int[][] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while(right >= left) {
			int mid = (right + left) / 2;
			if(nums[mid][0] == target) {
				return mid;
			}else if(target < nums[mid][0]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
			
		}
		return left - 1;
	}
	
}
