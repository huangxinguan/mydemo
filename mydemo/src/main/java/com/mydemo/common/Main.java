package com.mydemo.common;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int[] nums = {0, 1, 1};
		System.out.println(search(5));
		//2126753390
		//1702766719
	}
	
	public static int search(int n) {
        int start = 1;
        int end = n;
        
        while(start < end) {
        	int mid = start + (end - start) / 2;
        	if(isBadVersion(mid)) {
        		end = mid;
        	}else {
        		start = mid + 1;
        	}
        }
        return start;
    }
    public static boolean isBadVersion(int n) {
    	if(n == 4) {
    		return true;
    	}else if(n < 4) {
    		return false;
    	}else {
    		return true;
    	}
    }
}
