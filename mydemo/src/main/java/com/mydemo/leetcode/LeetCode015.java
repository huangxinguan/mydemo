package com.mydemo.leetcode;

public class LeetCode015 {
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
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int size = 0;
		ListNode link = head;
		while(null != link) {
			size++;
			link = link.next;
		}
		int cur = size - n;
		if(cur == 0) {
			head = head.next;
			return head;
		}
		link = head;
		size = 0;
		while(null != link) {
			if(size + 1 == cur) {
				ListNode node = link.next.next;
				link.next = node;
				break;
			}
			size++;
			link = link.next;
		}
		return head;
    }
}
