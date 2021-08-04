package com.mydemo.leetcode;

public class LeetCode17 {
	/*
	"hello"
	"ooolleoooleh"
	"abc"
"ccccbbbbaaaa"
	*/
	public static void main(String[] args) {
		String s1 = "adc";
		String s2 = "ccccbbbbaaaa";
		System.out.println(checkInclusion(s1, s2));
	}
	public static boolean checkInclusion(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		if(arr1.length > arr2.length) {
			return false;
		}
		int[] m = new int[256];
		int n = arr1.length;
		for(int i = 0; i < n; i++) {
			m[arr1[i]]++;
		}
		int left = 0;
		for(int i = 0; i < arr2.length; i++) {
			if(m[arr2[i]] != 0) {
				n--;
				m[arr2[i]]--;
				if(n == 0) {
					return true;
				}
			}else {
				i = left;
				left++;
				n = arr1.length;
				m = new int[256];
				for(int j = 0; j < n; j++) {
					m[arr1[j]]++;
				}
			}
		}
		return false;
	}
}
