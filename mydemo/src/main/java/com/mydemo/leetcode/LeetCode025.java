package com.mydemo.leetcode;

public class LeetCode025 {

	public ListNode reverseList(ListNode head) {
		if(null == head) {
			return head;
		}
		ListNode node = reverseList(head.next);
		if(null != node) {
			node.next = node;
			node = node.next;
		}
		return node;
	}

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
}
