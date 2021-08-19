package com.mydemo.leetcode;

import java.awt.List;

/*
  双指针  82 删除排序链表中的重复元素 II
  @author paic
 
 */
public class LeetCode042 {

	public ListNode deleteDuplicates(ListNode head) {
		if(null == head) {
			return head;
		}
		ListNode node = new ListNode();
		node.next = head;
		ListNode pre = node;
		node.val = -1000;
		ListNode preTemp = node;
		ListNode listNode = head;
		while(listNode != null && listNode.next != null) {
			if(listNode.val == listNode.next.val) {
				preTemp = listNode.next;
				pre.next=listNode.next.next;
				listNode = listNode.next.next;
			}else if(preTemp.val == listNode.val){
				pre.next = listNode.next;
				preTemp = listNode;
				listNode = listNode.next;
			}else {
				pre = listNode;
				preTemp = listNode;
				listNode = listNode.next;
			}
		}
		if(listNode != null && preTemp.val == listNode.val) {
			pre.next = listNode.next;
		}
		return node.next;
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
