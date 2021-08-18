package com.mydemo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode023 {
	private int[][] vector = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	public int orangesRotting(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(grid[i][j] == 2) {
					queue.add(new int[] {i, j});
					grid[i][j] = 0;
				}else if(grid[i][j] == 0) {
					grid[i][j] = -1;
				}else {
					grid[i][j] = Integer.MAX_VALUE;
				}
				
			}
		}
		int max = 0;
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int i = poll[0];
			int j = poll[1];
			for(int[] s : vector) {
				int x = i + s[0];
				int y = j + s[1];
				if(x >= 0 && x < row && y >= 0 && y < col && grid[x][y] > grid[i][j] + 1 && grid[x][y] != -1) {
					grid[x][y] = grid[i][j] + 1;
					queue.add(new int[] {x, y});
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				max = grid[i][j] > max ? grid[i][j] : max;
			}
		}
		if(max == Integer.MAX_VALUE) {
			max = -1;
		}
		return max;
	}
}
