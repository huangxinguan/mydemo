package com.mydemo.leetcode;

public class LeetCode12 {
	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while(j > i) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			j--;
			i++;
		}
    }
}
