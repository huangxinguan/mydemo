package com.mydemo.leetcode;

public class LeetCode13 {
	public String reverseWords(String s) {
		char[] arr = s.toCharArray();
		int start = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ' || i == arr.length - 1) {
				int end = arr[i] == ' ' ? i - 1 : i;
				while(end > start) {
					char temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				}
				start = i + 1;
			}
		}
        return new String(arr);
    }
}
