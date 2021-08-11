package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 全排列
 * @author paic
 *
 */
public class LeetCode028 {
	 List<List<Integer>> result = new ArrayList<>();
	 List<Integer> path = new ArrayList<>();
	 
	 Map<Integer, Object> visitMap = new HashMap<>();
	
//	public  void main(String[] args) {
//		permute(new int[] {1, 2,3});
//	}
	
	public  List<List<Integer>> permute(int[] nums) {
		combine(nums, -1);
		return result;
	}
	
	public  void combine(int[] nums, int index) {
		if(path.size() == nums.length) {
			result.add(new ArrayList<>(path));
			return;
		}
		for(int i = 0; i < nums.length; i++) {
			if(visitMap.get(nums[i]) != null) {
				continue;
			}
			visitMap.put(nums[i], "1");
			path.add(nums[i]);
			combine(nums, i);
			visitMap.put(path.get(path.size() - 1), null);
			path.remove(path.size() - 1);
		}
	}
}
