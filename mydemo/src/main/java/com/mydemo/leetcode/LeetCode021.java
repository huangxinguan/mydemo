package com.mydemo.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode021 {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node left = new Node(2);
		Node left1 = new Node(4);
		Node left2 = new Node(6);
		Node right = new Node(3);
		Node right1 = new Node(5);
		Node right2 = new Node(7);
		root.left = left;
		root.right = right;
		left.left = left1;
		left.right = right1;
		right.left = left2;
		right.right = right2;
		connect(root);
		
		
	}
	
	public static Node connect(Node root) {
		if(null == root) {
			return root;
		}
		List<Node> list = bfs(root);
		int len = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).val);
			if(i == len || i == list.size() - 1) {
				list.get(i).next = null;
				len = len * 2;
			}else {
				list.get(i).next = list.get(i + 1);
			}
		}
        return root;
    }
	
	public static List<Node> bfs(Node root){
		List<Node> list = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		list.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(null != node.left) {
				list.add(node.left);
				queue.add(node.left);
			}
			if(null != node.right) {
				list.add(node.right);
				queue.add(node.right);
			}
		}
		return list;
	}
	
		
	
	
	static class Node{
		public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }
	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	}
}
