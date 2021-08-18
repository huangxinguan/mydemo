package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 大小字母全排列
 * @author paic
 *
 */
public class LeetCode029 {
	 List<String> result = new ArrayList<>();
	
	public  void main(String[] args) {
		letterCasePermutation("a1b2");
	}
	
	public  List<String> letterCasePermutation(String s) {
		char[] chars = s.toCharArray();
		backTree(chars, 0);
		return result;
    }
	
	public  void backTree(char[] chars, int start) {
		result.add(new String(chars));
		for(int i = start; i < chars.length; i++) {
			if(chars[i] <= 'z' && chars[i] >= 'a') {
				chars[i] = (char) (chars[i] - 32);
				backTree(chars, i + 1);
				chars[i] = (char) (chars[i] + 32);
			}else if(chars[i] <= 'Z' && chars[i] >= 'A') {
				chars[i] = (char) (chars[i] + 32);
				backTree(chars, i + 1);
				chars[i] = (char) (chars[i] - 32);
			}else {
				continue;
			}
			
			
		}
	}
}
