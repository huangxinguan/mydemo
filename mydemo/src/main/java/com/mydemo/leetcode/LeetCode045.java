package com.mydemo.leetcode;

/**
 * "xywrrmp"
"xywrrmu#p"

"ab#c"
"ad#c"
 * @author paic
 *
 */
public class LeetCode045 {
	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		backspaceCompare(s, t);
	}
	public static boolean backspaceCompare(String s, String t) {
		int i = s.length() - 1;
		int j = t.length() - 1;
		int count1 = 0;
		int count2 = 0;
		
		while(i >= 0 || j >= 0) {
		    while(i >=0 && ('#' == s.charAt(i) || count1 > 0)) {
				if('#' == s.charAt(i)) {
					count1++;
					i--;
				}else {
					count1--;
					i--;
				}
			}
		    while(j >=0 && ('#' == t.charAt(j)|| count2 > 0)) {
				if('#' == t.charAt(j)) {
					count2++;
					j--;
				}else {
					count2--;
					j--;
				}
			}
		    if(i < 0 || j < 0) {
		    	break;
		    }
		    if(s.charAt(i) == t.charAt(j)) {
		    	i--;
		    	j--;
		    }else {
		    	return false;
		    }
		}
		
		return i < 0 && j < 0;
    }
}
