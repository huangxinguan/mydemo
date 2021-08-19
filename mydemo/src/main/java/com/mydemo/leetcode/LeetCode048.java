package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希表 滑动窗口 438. 找到字符串中所有字母异位词
 * 
 * @author paic
 * "cbaebabacd"
"abc"
 *
 */

public class LeetCode048 {
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		findAnagrams(s, p);
				
	}
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int n = s.length();
		int m = p.length();
		int count = m;
		for(int i = 0; i < p.length(); i++) {
			if(map.get(p.charAt(i) + "") != null) {
				Integer integer = map.get(p.charAt(i) + "");
				integer++;
				map.put(p.charAt(i) + "", integer);
			}else {
				map.put(p.charAt(i) + "", 1);
			}
		}
		for(int i = 0; i < n; i++) {
			int k = i - m;
			if(k >= 0) {
				Integer val = map.get(s.charAt(k) + "");
				if(val != null && val > -1) {
					val++;
					map.put(s.charAt(k) + "", val);
					count++;
				}
				if(val != null && val < 0) {
					val++;
					map.put(s.charAt(k) + "", val);
				}
			}
			Integer integer = map.get(s.charAt(i) + "");
			if(integer != null) {
				if(integer > 0) {
					count--;
				}
				integer--;
				map.put(s.charAt(i) + "", integer);
			}
			if(count == 0) {
				result.add(i-m+1);
			}
		}
		return result;
	}
	
	public static List<Integer> findAnagrams2(String s, String p) {
		List<Integer> result = new ArrayList<>();
		int[] flag = new int[26];
		for(int i = 0; i < 26; i++) {
			flag[i] = 30001;
		}
		for(int i = 0; i < p.length(); i++) {
			int index = p.charAt(i) - 'a';
			flag[index] = flag[index]  == 30001 ? 1 : flag[index] + 1;
		}
		int n = s.length();
		int m = p.length();
		int count = m;
		for(int i = 0; i < s.length(); i++) {
			int k = i - m;
			if(k >= 0) {
				if(flag[s.charAt(k) - 'a'] != 30001) {
					if(flag[s.charAt(k) - 'a'] > -1) {
						count++;
					}
					flag[s.charAt(k) - 'a']++;
				}
			}
			if(flag[s.charAt(i) - 'a'] != 30001) {
				if(flag[s.charAt(i) - 'a'] > 0) {
					count--;
				}
				flag[s.charAt(i) - 'a']--;
			}
			if(count == 0) {
				result.add(i - m + 1);
			}
		}
		return result;
	}
}
