package com.mydemo.leetcode;

public class LeetCode016 {
	
	public static void main(String[] args) {
		String s = "";
		System.out.println(getNextMax(s));
	}
	public static int[] getNext(String ps) {

	    char[] p = ps.toCharArray();

	    int[] next = new int[p.length];

	    next[0] = -1;

	    int j = 0;

	    int k = -1;

	    while (j < p.length - 1) {

	       if (k == -1 || p[j] == p[k]) {

	           next[++j] = ++k;

	       } else {

	           k = next[k];

	       }

	    }

	    return next;

	}
	
	public static int getNextMax(String s) {
		char[] as = s.toCharArray();
		int from = 0;
		int max = 0;
		int[] m = new int[256];
		for(int i = 0; i < as.length; i++) {
			if(m[as[i]] != 0 && m[as[i]] > from - 1) {
				from = m[as[i]];
			}else {
				
			}
			m[as[i]] = i + 1;
//			System.out.println(m[as[i]]);
			max = i - from + 1 > max ? i - from + 1 : max;
		}
	    return max;
	}
}
