package com.mydemo.leetcode;

public class LeetCode019 {
	public static void main(String[] args) {
		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
				 {0,0,0,0,0,0,0,1,1,1,0,0,0},
				 {0,1,1,0,1,0,0,0,0,0,0,0,0},
				 {0,1,0,0,1,1,0,0,1,0,1,0,0},
				 {0,1,0,0,1,1,0,0,1,1,1,0,0},
				 {0,0,0,0,0,0,0,0,0,0,1,0,0},
				 {0,0,0,0,0,0,0,1,1,1,0,0,0},
				 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		System.out.println(maxAreaOfIsland(grid));

	}
	public static int maxAreaOfIsland(int[][] grid) {
		int max = 0;
		int[][] visit = new int[grid.length][grid[0].length];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 0 || visit[i][j] == 1) {
					continue;
				}
				int dfs = dfs(grid, i, j, visit);
				max = dfs > max ? dfs : max; 		
			}
		}
		return max;
    }
	public static int dfs(int[][] grid, int row, int col, int[][] visit){
		if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1 || visit[row][col] == 1) {
			return  0;
		}
		if(grid[row][col] == 0) {
			return 0;
		}
		visit[row][col] = 1;
		int left = dfs(grid, row, col - 1, visit);
		int up = dfs(grid, row - 1, col, visit);
		int right = dfs(grid, row, col + 1, visit);
		int down = dfs(grid, row + 1, col, visit);
		return 1 + left + up + right + down;
	}
}
