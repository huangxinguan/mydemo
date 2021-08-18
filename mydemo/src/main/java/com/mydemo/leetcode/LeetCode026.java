package com.mydemo.leetcode;

public class LeetCode026 {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while(cur != null) {
			ListNode tempNode = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tempNode;
			
		}
		return pre;
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
