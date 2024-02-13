package org.example.practice;

import java.util.ArrayDeque;
import java.util.Queue;

public class TwoTreeSame {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pqueue = new ArrayDeque<>();
        Queue<TreeNode> qqueue = new ArrayDeque<>();
        if(p == null && q== null) { return true; } else if (p== null || q == null) { return false; }
        pqueue.add(p);
        qqueue.add(q);
        while(!pqueue.isEmpty() && !qqueue.isEmpty()) {
            TreeNode cp = pqueue.remove();
            TreeNode cq = qqueue.remove();
//            if (cp == cq) { continue; }
            if (cp.val != cq.val) { return false; }
            boolean leftFlag = false;
            boolean rightFlag = false;
            if(cp.left != null) { pqueue.add(cp.left); leftFlag = !leftFlag;}
            if(cq.left != null) { qqueue.add(cq.left); leftFlag = !leftFlag;}
            if(cp.right != null) { pqueue.add(cp.right); rightFlag = !rightFlag;}
            if(cq.right != null) { qqueue.add(cq.right); rightFlag = !rightFlag;}
            if(leftFlag || rightFlag) {return false;}
        }
        return pqueue.isEmpty() && qqueue.isEmpty();
    }

    public static void main(String[] args) {
//        System.out.println(
//                new TwoTreeSame().isSameTree(
//                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null))),
//                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)))
//                )
//        );
//        System.out.println(
//                new TwoTreeSame().isSameTree(
//                        new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null))),
//                        new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)), null)
//                )
//        );
        System.out.println(new TwoTreeSame().isSameTree(null, new TreeNode(1, null , null)));
    }
}
