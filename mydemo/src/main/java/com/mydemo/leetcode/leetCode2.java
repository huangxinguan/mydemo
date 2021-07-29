package com.mydemo.leetcode;

public class leetCode2 {
	public static void main(String[] args) {
		System.out.println(mySqrt(2147483647));
	}
	public static int mySqrt(int x) {
		long i = 0;
		long y = i * i;
		while(!(y > x) ) {
			if(y == x) {
				return (int)i;
			}
			i++;
			y = i * i;
		}
		return (int)(i - 1);
    }
}
