package com.mydemo.leetcode;

public class LeetCode014 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
			
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode middleNode(ListNode head) {
		int size = 0;
		ListNode link = head;
		while(null != link) {
			link = link.next;
			size++;
		}
		int mid = size / 2 + 1;
		size = 0;
		link = head;
		while(null != link) {
			size++;
			if(mid == size) {
				return link;
			}
			link = link.next;
			
		}
		return null;
    }
	
	public ListNode middleNode1(ListNode head) {
		ListNode p = head;
		ListNode q = head;
		while(q != null && null != q.next) {
			p = p.next;
			q = q.next.next;
		}
		return p;
    }
}
