package com.mydemo.leetcode;

import java.util.Arrays;

public class LeetCode18 {
	//[1,1,1],[1,1,0],[1,0,1]
	public static void main(String[] args) {
		int[][] image = new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
		int[][] floodFill = floodFill(image, 1, 1, 2);
		System.out.println(Arrays.toString(floodFill[0]));
		System.out.println(Arrays.toString(floodFill[1]));
		System.out.println(Arrays.toString(floodFill[2]));
		
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int[][] visit = new int[image.length][image[0].length];
		dfs(image, sr, sc, newColor, image[sr][sc], visit);
		return image;
	}
	
	public static void dfs(int[][] image, int sr, int sc, int newColor, int a, int[][] visit) {
		if(sr < 0 || sc < 0) {
			return;
		}
		if(sr > image.length - 1 || sc > image[0].length - 1) {
			return;
		}
		if(visit[sr][sc] != 0) {
			return;
		}
		if(a != image[sr][sc]) {
			return;
		}
		int temp = image[sr][sc];
		visit[sr][sc] = 1;
		image[sr][sc] = newColor;
		//遍历左边的点
		dfs(image, sr, sc - 1, newColor, temp, visit);
		//遍历上边的点
		dfs(image, sr - 1, sc, newColor, temp, visit);
		//遍历右边的点
		dfs(image, sr, sc + 1, newColor, temp, visit);
		////遍历下边的点
		dfs(image, sr + 1, sc, newColor, temp, visit);
	}
}
