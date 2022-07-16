// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/

package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofNaryTree {
	
	public int maxDepth(NaryNode root) {
		if(root==null) {
			return 0;
		}
		
		Queue<NaryNode> queue = new LinkedList<>();
		queue.offer(root);
		
		int depth = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				NaryNode node = queue.poll();
				for(NaryNode child: node.child) {
					queue.offer(child);
				}
			}
			depth++;
		}
		
		
		return depth;
	}

	public static void main(String[] args) {
		MaximumDepthofNaryTree mt = new MaximumDepthofNaryTree();
		
		NaryNode root = new NaryNode(1);
		root.child.add(new NaryNode(2));
		root.child.add(new NaryNode(3));
		root.child.add(new NaryNode(4));
		root.child.add(new NaryNode(5));
		
		root.child.get(1).child.add(new NaryNode(6));
		root.child.get(1).child.add(new NaryNode(7));
		
		root.child.get(2).child.add(new NaryNode(8));
		
		root.child.get(3).child.add(new NaryNode(9));
		root.child.get(3).child.add(new NaryNode(10));
		
		root.child.get(1).child.get(1).child.add(new NaryNode(11));
		
		root.child.get(2).child.get(0).child.add(new NaryNode(12));
		
		root.child.get(3).child.get(0).child.add(new NaryNode(13));
		
		root.child.get(1).child.get(1).child.get(0).child.add(new NaryNode(14));
		
		System.out.println(mt.maxDepth(root));
		
	}

}
