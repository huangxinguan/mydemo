package com.mydemo.leetcode;

public class LeetCode024 {

	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode head = new ListNode();
		 ListNode node = head;
		 while(null != l1 && null != l2) {
			 if(l1.val > l2.val) {
				 node.next = l2;
				 l2 = l2.next;
			 }else {
				 node.next = l1;
				 l1 = l1.next;
			 }
			 node = node.next;
		 }
		 if(null == l1) {
			 node.next = l2;
		 }
		 if(null == l2) {
			 node.next = l1;
		 }
		 return head.next;
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
