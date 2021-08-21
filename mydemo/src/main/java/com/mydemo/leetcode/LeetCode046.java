package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 双指针 986. 区间列表的交集
 * @author paic
 *
 */
public class LeetCode046 {
	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
		int i = 0;
		int j = 0;
		int n = firstList.length;
		int m = secondList.length;
		if(m == 0 || n == 0) {
			return new int[0][0];
		}
		int start1 = firstList[i][0];
		int end1 = firstList[i][1];
		int start2 = secondList[j][0];
		int end2 = secondList[j][1];
		boolean flag1 = false;
		boolean flag2 = false;
		List<int[]> result = new ArrayList<>();
		while(i < n && j < m) {
			if(flag1) {
				start1 = firstList[i][0];
				end1 = firstList[i][1];
				flag1 = false;
			}
			if(flag2) {
				start2 = secondList[j][0];
				end2 = secondList[j][1];
				flag2 = false;
			}
			int startMax = start1 > start2 ? start1 : start2;
			int endMin = end1 > end2 ? end2 : end1;
			if(endMin < startMax) { //没有交集
				if(start2 >= end1) {
					i++;
					flag1 = true;
				}else {
					j++;
					flag2 = true;
				}
			}else {
				result.add(new int[] {startMax, endMin});
				if(end1 > end2) {
					start1 = end2;
					j++;
					flag2 = true;
				}else{
					start2 = end1;
					i++;
					flag1 = true;
				}
			}
		}
		if(result.size() > 0) {
			int[][] res = new int[result.size()][2];
			for(int k = 0; k < result.size(); k++) {
				res[k] = result.get(k);
			}
			return res;
		}else {
			return new int[0][0];
		}
		
    }
}
