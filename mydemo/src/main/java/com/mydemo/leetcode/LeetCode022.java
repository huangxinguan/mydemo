package com.mydemo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode022 {
	private int[][] vector = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	public int[][] updateMatrix(int[][] mat) {
		Queue<int[]> queue = new LinkedList<>();
		int row = mat.length;
		int col = mat[0].length;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(mat[i][j] == 0) {
					queue.add(new int[] {i, j});
				}else {
					mat[i][j] = row + col;
				}
			}
		}
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int i = poll[0];
			int j = poll[1];
			for(int[] temp : vector) {
				int x = i + temp[0];
				int y = j + temp[1];
				if(x >= 0 && x < row && y >= 0 && y < col && mat[x][y] > mat[i][j] + 1) {
					mat[x][y] = mat[i][j] + 1;
					queue.add(new int[] {x, y});
				}
			}
		}
		return mat;
	}
	
	class Node{
		int x;
		int y;
		Node(int i, int j){
			x = i;
			y = j;
		}
	}
}
