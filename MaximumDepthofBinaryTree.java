// https://leetcode.com/problems/maximum-depth-of-binary-tree/

package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
	
	
//	Iterative BFS to find the max depth of a tree
	
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int count =0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size-- >0) {
				TreeNode node = queue.poll();
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			count++;
		}
		
		return count;
	}

	

	public static void main(String[] args) {
		MaximumDepthofBinaryTree md = new MaximumDepthofBinaryTree();
		
		TreeNode root = new TreeNode(3);
		TreeNode n1 = new TreeNode(9);
		TreeNode n2 = new TreeNode(20);
		TreeNode n3 = new TreeNode();
		TreeNode n4 = new TreeNode();
		TreeNode n5 = new TreeNode(15);
		TreeNode n6 = new TreeNode(7);
		TreeNode n7 = new TreeNode(11);
		TreeNode n8 = new TreeNode(1);
		
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		n5.left = n7;
		n6.right = n8;
		
		System.out.println(md.maxDepth(root));
	}

}
