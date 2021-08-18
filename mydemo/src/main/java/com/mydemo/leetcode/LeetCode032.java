package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 动态规划 三角形最小路径之和
 * @author paic
 *
 */
public class LeetCode032 {
	
	public static void main(String[] args) {
		List<List<Integer>> tri = new ArrayList<>();
		
		tri.add(Arrays.asList(2));
		tri.add(Arrays.asList(3,4));
		tri.add(Arrays.asList(6,5,7));
		tri.add(Arrays.asList(4,1,8,3));
		minimumTotal(tri);
	}
	
	public static int minimumTotal(List<List<Integer>> tri) {
		int n = tri.size();
		int m = tri.get(n-1).size();
		int[][] dp = new int[n][m];
		for(int i = 0; i < tri.get(0).size(); i++) {
			dp[0][i] = tri.get(0).get(i);
		}
		for(int i = 1; i < tri.size(); i++) {
			for(int j = 0; j < tri.get(i).size(); j++) {
				if(j == 0) {
					dp[i][j] = dp[i-1][0] + tri.get(i).get(j);			
				}else if(j == tri.get(i).size() - 1) {
					dp[i][j] = dp[i-1][j-1] + tri.get(i).get(j);
				}else {
					dp[i][j] = min(dp[i-1][j-1] + tri.get(i).get(j), dp[i-1][j] + tri.get(i).get(j));
				}
				
			}
		}
		int min = dp[n-1][0];
		for(int i = 1; i < tri.get(n-1).size(); i++) {
			min = min(dp[n-1][i], min);
		}
		return min;
    }
	
	private static int min(int a, int b) {
		return a > b ? b : a;
	}
}
