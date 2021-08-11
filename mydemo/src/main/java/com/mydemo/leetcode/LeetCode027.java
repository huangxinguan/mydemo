package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode027 {
	
	static List<List<Integer>> result = new ArrayList<>();
	static List<Integer> path = new ArrayList<>();
	
	public static List<List<Integer>> combine(int n, int k) {
		combineBack(n, k, 1);
		return result;
	}
	
	public static void combineBack(int n, int k, int start) {
		if(path.size() == k) {
			result.add(new ArrayList<>(path));
			return;
		}
		for(int i = start; i <= n; i++) {
			path.add(i);
			combineBack(n, k, i + 1);
			path.remove(path.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		combine(4, 2);
		System.out.println("hello");
	}
}
