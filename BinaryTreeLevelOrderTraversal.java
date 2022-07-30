// straight forward BFS Implementation

package com.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		
		if(root == null)
			return wrapList;
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			
			for(int i=0; i<levelNum; i++) {
				if(queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		
		return wrapList;
	}

	public static void main(String[] args) {
		
		BinaryTreeLevelOrderTraversal btl = new BinaryTreeLevelOrderTraversal();
		
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
//		n1.left = n3;
//		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		n5.left = n7;
		n6.right = n8;
		
		System.out.println(btl.levelOrder(root));
		
	}

}
