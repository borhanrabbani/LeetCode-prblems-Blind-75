//https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/

package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
	
	public int minDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int i=0;
		while(!queue.isEmpty()) {
			i++;
			int k = queue.size();
			for(int j=0; j<k; j++) {
				TreeNode tn = queue.peek();
				if(tn.left!=null)
					queue.offer(tn.left);
				if(tn.right!=null)
					queue.offer(tn.right);
				queue.poll();
				if(tn.left==null && tn.right==null) {
					return i;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		MinimumDepthofBinaryTree md = new MinimumDepthofBinaryTree();
		
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
		
		System.out.println(md.minDepth(root));
	}

}
